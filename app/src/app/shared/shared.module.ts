import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import {
  ButtonComponent,
  LogoComponent,
  ModalComponent,
  TextFieldComponent,
} from './components';
import { ImageFieldComponent } from './components/image-field/image-field.component';

const components = [
  ButtonComponent,
  LogoComponent,
  ModalComponent,
  TextFieldComponent,
];

@NgModule({
  declarations: [...components, ButtonComponent, ModalComponent, ImageFieldComponent],
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  exports: [...components],
})
export class SharedModule {}
