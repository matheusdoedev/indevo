import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent {
  createNewPDIForm: FormGroup;
  createNewPDIModalIsVisible: boolean = true;

  constructor(private formBuilder: FormBuilder) {
    this.createNewPDIForm = this.formBuilder.group({
      title: ['', [Validators.required]],
      description: ['', [Validators.required]],
      thumbUrl: [''],
    });
  }

  handleOpenNewPDIModal() {
    this.createNewPDIModalIsVisible = true;
  }
}
