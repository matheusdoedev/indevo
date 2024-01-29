import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';

import { SignInDto, SignUpDto } from '../interfaces';

@Injectable({
  providedIn: 'root',
})
export class IndevoServiceService {
  baseUrl: string = 'http://localhost:8080/api/v1';

  constructor(private http: HttpClient) {}

  signin(data: SignInDto) {
    return this.http.post<HttpResponse<unknown>>(
      this.baseUrl + '/auth/login',
      data
    );
  }

  signup(data: SignUpDto) {
    return this.http.post<HttpResponse<Omit<SignUpDto, 'password'>>>(
      this.baseUrl + '/auth/register',
      data
    );
  }
}
