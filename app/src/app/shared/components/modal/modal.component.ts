import {
  Component,
  EventEmitter,
  Input,
  OnChanges,
  Output,
} from '@angular/core';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.scss'],
})
export class ModalComponent {
  @Input() modalIsVisible: boolean = false;

  @Output() onClose: EventEmitter<unknown> = new EventEmitter();

  handleClose() {
    this.modalIsVisible = false;
    this.onClose.emit();
  }
}
