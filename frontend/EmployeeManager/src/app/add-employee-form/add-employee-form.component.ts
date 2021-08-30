import { HttpErrorResponse } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Employee } from '../models/Employee.model';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'add-employee-form',
  templateUrl: './add-employee-form.component.html',
  styleUrls: ['./add-employee-form.component.css']
})
export class AddEmployeeFormComponent implements OnInit{

  public email: String;
  public name: String;
  public phone: String;
  public jobTitle: String;
  public imageUrl: String;

  @Input('employee') employee: Employee;

  constructor(public activeModal: NgbActiveModal,
              private employeeService: EmployeeService) { }

  ngOnInit(): void {
    if(this.employee == null){
      this.email = "";
      this.name = "";
      this.imageUrl = "";
      this.jobTitle = "";
      this.phone = "";
    }
    else{
      this.email = this.employee.email;
      this.name = this.employee.name;
      this.imageUrl = this.employee.imageurl;
      this.jobTitle = this.employee.jobtitle;
      this.phone = this.employee.phone;
    }
  }
  
  public AddEmployee(form){
    // console.log("add form comp: ", emp);
    this.employeeService.addEmployee(form.value).subscribe();
    this.activeModal.dismiss('Cross click');
  }

}