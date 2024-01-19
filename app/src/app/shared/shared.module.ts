import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import {
  ButtonComponent,
  ImageFieldComponent,
  LogoComponent,
  ModalComponent,
  TextFieldComponent,
} from './components';
import { SelectComponent } from './components/select/select.component';

const components = [
  ButtonComponent,
  ImageFieldComponent,
  LogoComponent,
  ModalComponent,
  TextFieldComponent,
];

@NgModule({
  declarations: [...components, SelectComponent],
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  exports: [...components],
})
export class SharedModule {}
