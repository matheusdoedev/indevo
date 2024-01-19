import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class IndevoServiceService {
  baseUrl: string = process.env['API_URL'];

  constructor() {}
}
