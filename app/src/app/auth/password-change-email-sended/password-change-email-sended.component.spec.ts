import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PasswordChangeEmailSendedComponent } from './password-change-email-sended.component';

describe('PasswordChangeEmailSendedComponent', () => {
  let component: PasswordChangeEmailSendedComponent;
  let fixture: ComponentFixture<PasswordChangeEmailSendedComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PasswordChangeEmailSendedComponent]
    });
    fixture = TestBed.createComponent(PasswordChangeEmailSendedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
