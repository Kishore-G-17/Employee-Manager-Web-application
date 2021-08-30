import { Pipe, PipeTransform } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { AddEmployeeFormComponent } from '../add-employee-form/add-employee-form.component';
import { Employee } from '../models/Employee.model';

@Pipe({
  name: 'openModal',
  pure: true,
})
export class OpenModalPipe implements PipeTransform {

  public modalRef;
  constructor(private modalService: NgbModal){}

  transform(value: Employee, ...args: unknown[]){
    this.openModal(value);
  }

  public openModal(employee: Employee){
    this.modalRef = this.modalService.open(AddEmployeeFormComponent);
    this.modalRef.componentInstance.employee = employee;
  }

}