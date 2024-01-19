import { Component, EventEmitter, Input, Output } from '@angular/core';

import { Media } from '../../interfaces';

@Component({
  selector: 'app-image-field',
  templateUrl: './image-field.component.html',
  styleUrls: ['./image-field.component.scss'],
})
export class ImageFieldComponent {
  @Input() name: string = '';
  @Input() label: string = '';
  @Input() placeholder: string = '';

  @Output() onChange: EventEmitter<Media> = new EventEmitter();

  handleChangeImage(event: Event) {
    const files = (event.currentTarget as HTMLInputElement).files;

    if (!files) return;

    const file = files[0];
    const fileObject: Media = {
      name: URL.createObjectURL(file),
      type: 'image',
      file,
    };

    this.onChange.emit(fileObject);
  }
}
