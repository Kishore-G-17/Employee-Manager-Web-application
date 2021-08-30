import { HttpErrorResponse } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { AddEmployeeFormComponent } from '../add-employee-form/add-employee-form.component';
import { Employee } from '../models/Employee.model';
import { OpenModalPipe } from '../pipes/openModal.pipe';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

    @Input() public employees: Employee[];

    constructor(private employeeService: EmployeeService,                
                private openModalPipe: OpenModalPipe) {}

    ngOnInit(): void {
        this.getEmployees();
    }

    public getEmployees(){
        this.employeeService.getEmployees().subscribe(
        (response: Employee[])=> {
            this.employees = response;                
        },
        (error: HttpErrorResponse) =>{
            alert(error);
        });
    }

    public OpenModal(employee: Employee){
        this.openModalPipe.transform(employee);
    }

}
