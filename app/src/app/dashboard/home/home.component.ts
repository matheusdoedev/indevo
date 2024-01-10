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

  addGoalForm: FormGroup;
  addGoalModalIsVisible: boolean = false;

  constructor(private formBuilder: FormBuilder) {
    this.createNewPDIForm = this.formBuilder.group({
      title: ['', [Validators.required]],
      description: ['', [Validators.required]],
      thumbUrl: [''],
    });

    this.addGoalForm = this.formBuilder.group({
      title: ['', [Validators.required]],
      description: ['', [Validators.required]],
      thumbUrl: [''],
      goalType: ['', [Validators.required]],
      unitOfMeasurement: ['', [Validators.required]],
      target: [0, [Validators.required]],
    });
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
    this.handleCloseAddNewGoalModal();
    this.handleOpenNewPDIModal();
  }
}
