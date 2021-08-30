import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeService } from './services/employee.service';
import { HttpClientModule } from '@angular/common/http';
import { BsNavbarComponent } from './bs-navbar/bs-navbar.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { AddEmployeeFormComponent } from './add-employee-form/add-employee-form.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { OpenModalPipe } from './pipes/openModal.pipe';

@NgModule({
  declarations: [
    AppComponent,
    BsNavbarComponent,
    EmployeeDetailsComponent,
    AddEmployeeFormComponent,
    OpenModalPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
    FormsModule,
  ],
  providers: [
    EmployeeService,
    OpenModalPipe
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
