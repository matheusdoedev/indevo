import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { Media } from 'src/app/shared/interfaces';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent {
  createNewPDIForm: FormGroup;
  createNewPDIModalIsVisible: boolean = false;

  addGoalForm: FormGroup;
  addGoalModalIsVisible: boolean = false;
  addGoalThumb?: Media;

  constructor(private formBuilder: FormBuilder) {
    this.createNewPDIForm = this.formBuilder.group({
      title: ['', [Validators.required]],
      description: ['', [Validators.required]],
      thumbUrl: [''],
    });

    this.addGoalForm = this.formBuilder.group({
      title: ['', [Validators.required]],
      description: ['', [Validators.required]],
      goalType: ['', [Validators.required]],
      unitOfMeasurement: ['', [Validators.required]],
      target: [0, [Validators.required]],
    });
  }

  handleChangeGoalThumb(fileObject: Media) {
    this.addGoalThumb = fileObject;
  }

  handleOpenNewPDIModal() {
    this.createNewPDIModalIsVisible = true;
  }

  handleCloseNewPDIModal() {
    this.createNewPDIModalIsVisible = false;
  }

  handleOpenAddGoalModal() {
    this.handleCloseNewPDIModal();
    this.addGoalModalIsVisible = true;
  }

  handleCloseAddNewGoalModal() {
    this.addGoalModalIsVisible = false;
    this.handleOpenNewPDIModal();
  }

  handleSaveGoal() {
    console.log(this.addGoalForm.value);
    console.log(this.addGoalThumb);
    this.handleCloseAddNewGoalModal();
    this.handleOpenNewPDIModal();
  }
}
