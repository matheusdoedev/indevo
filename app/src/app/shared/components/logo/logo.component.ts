import { Component, ElementRef, Input, ViewChild } from '@angular/core';

@Component({
  selector: 'app-logo',
  templateUrl: './logo.component.html',
})
export class LogoComponent {
  @ViewChild('logo') logo!: ElementRef<HTMLImageElement>;

  @Input() width: number = 109;
  @Input() height: number = 26;

  logoImgSrc: string = '../../../assets/icons/indevo.svg';

  ngOnInit() {
    this.logo.nativeElement.style.width = this.width.toString();
    this.logo.nativeElement.style.height = this.height.toString();
  }
}
