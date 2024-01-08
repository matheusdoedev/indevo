import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ButtonComponent, TextFieldComponent } from './components';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

const components = [ButtonComponent, TextFieldComponent];

@NgModule({
  declarations: [...components],
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  exports: [...components],
})
export class SharedModule {}
