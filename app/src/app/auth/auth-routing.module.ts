import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { RecoverPasswordComponent } from './recover-password/recover-password.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { PasswordChangeConfirmationComponent } from './password-change-confirmation/password-change-confirmation.component';
import { PasswordChangeEmailSendedComponent } from './password-change-email-sended/password-change-email-sended.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent,
  },
  {
    path: 'create-account',
    component: CreateAccountComponent,
  },
  {
    path: 'recover-password',
    component: RecoverPasswordComponent,
  },
  {
    path: 'change-password',
    component: ChangePasswordComponent,
  },
  {
    path: 'password-change-confirmation',
    component: PasswordChangeConfirmationComponent,
  },
  {
    path: 'password-change-email-sended',
    component: PasswordChangeEmailSendedComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AuthRoutingModule {}
