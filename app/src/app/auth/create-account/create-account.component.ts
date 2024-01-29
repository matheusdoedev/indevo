import { HttpResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { SignUpDto } from 'src/app/shared/interfaces';

import { IndevoServiceService } from 'src/app/shared/services/indevo-service.service';

const EMAIL_NOT_EQUAL_ERROR_MESSAGE =
  'Email is not equal to the confirmation email.';

const PASSWORD_NOT_EQUAL_ERROR_MESSAGE =
  'Password is not equal to the confirmation password.';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.scss'],
})
export class CreateAccountComponent {
  signUpForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private indevoService: IndevoServiceService
  ) {
    this.signUpForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      username: ['', Validators.required],
      email: ['', Validators.required],
      confirmEmail: ['', Validators.required],
      password: ['', Validators.required],
      confirmPassword: ['', Validators.required],
    });
  }

  handleSubmitSignUp() {
    if (this.signUpForm.invalid) {
      return;
    }

    const { email, confirmEmail, password, confirmPassword } =
      this.signUpForm.value;

    if (email !== confirmEmail) {
      this.signUpForm.setErrors({
        email: EMAIL_NOT_EQUAL_ERROR_MESSAGE,
        confirmEmail: EMAIL_NOT_EQUAL_ERROR_MESSAGE,
      });
      return;
    }

    if (password !== confirmPassword) {
      this.signUpForm.setErrors({
        password: PASSWORD_NOT_EQUAL_ERROR_MESSAGE,
        confirmPassword: PASSWORD_NOT_EQUAL_ERROR_MESSAGE,
      });
      return;
    }

    const signUpDto: SignUpDto = {
      firstName: this.signUpForm.value.firstName,
      lastName: this.signUpForm.value.lastName,
      username: this.signUpForm.value.username,
      email,
      password,
      hasAcceptedUseTerms: true,
    };

    this.indevoService.signup(signUpDto).subscribe((res) => {
      console.log(res);
    });
  }
}
