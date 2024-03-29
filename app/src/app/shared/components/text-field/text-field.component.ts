import { Component, Input } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-text-field',
  templateUrl: './text-field.component.html',
  styleUrls: ['./text-field.component.scss'],
})
export class TextFieldComponent {
  @Input() name: string = '';
  @Input() label: string = '';
  @Input() placeholder: string = '';
  @Input()
  formGroup!: FormGroup;
}
