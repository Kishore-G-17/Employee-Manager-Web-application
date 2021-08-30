import { Component } from '@angular/core';
import { Employee } from '../models/Employee.model';
import { OpenModalPipe } from '../pipes/openModal.pipe';

@Component({
  selector: 'bs-navbar',
  templateUrl: './bs-navbar.component.html',
  styleUrls: ['./bs-navbar.component.css']
})
export class BsNavbarComponent{

  constructor(private openModalPipe: OpenModalPipe) {}

  public OpenModal(employee: Employee){
    this.openModalPipe.transform(employee);
  }

}
