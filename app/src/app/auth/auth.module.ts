import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AuthComponent } from './auth.component';
import { LoginComponent } from './login/login.component';
import { AuthRoutingModule } from './auth-routing.module';
import { AuthLayoutComponent } from './auth-layout/auth-layout.component';
import { SharedModule } from '../shared/shared.module';
import { CreateAccountComponent } from './create-account/create-account.component';
import { RecoverPasswordComponent } from './recover-password/recover-password.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { PasswordChangeConfirmationComponent } from './password-change-confirmation/password-change-confirmation.component';
import { PasswordChangeEmailSendedComponent } from './password-change-email-sended/password-change-email-sended.component';

@NgModule({
  declarations: [
    AuthComponent,
    LoginComponent,
    AuthLayoutComponent,
    CreateAccountComponent,
    RecoverPasswordComponent,
    ChangePasswordComponent,
    PasswordChangeConfirmationComponent,
    PasswordChangeEmailSendedComponent,
  ],
  imports: [
    CommonModule,
    AuthRoutingModule,
    SharedModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  exports: [AuthRoutingModule],
})
export class AuthModule {}
