import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { HomeComponent } from './home/home.component';
import { DashboardModuleRouting } from './dashboard-routing.module';
import { DashboardLayoutComponent } from './dashboard-layout/dashboard-layout.component';
import { SharedModule } from '../shared/shared.module';

@NgModule({
  declarations: [HomeComponent, DashboardLayoutComponent],
  imports: [DashboardModuleRouting, CommonModule, SharedModule, FormsModule],
})
export class DashboardModule {}
