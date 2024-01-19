import { Component, Input } from '@angular/core';
import { FormGroup } from '@angular/forms';

import { SelectOption } from '../../interfaces';

@Component({
  selector: 'app-select',
  templateUrl: './select.component.html',
  styleUrls: ['./select.component.scss'],
})
export class SelectComponent {
  @Input() name: string = '';
  @Input() label: string = '';
  @Input() options: SelectOption[] = [];
  @Input()
  formGroup!: FormGroup;
}
