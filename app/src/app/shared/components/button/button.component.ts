import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.scss'],
})
export class ButtonComponent {
  type: string = 'button';

  @Output() onClick: EventEmitter<unknown> = new EventEmitter();

  handleClick() {
    this.onClick.emit();
  }
}
