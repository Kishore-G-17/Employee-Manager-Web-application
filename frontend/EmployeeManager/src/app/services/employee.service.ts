import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Employee } from '../models/Employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apiServerUrl = environment.apiBaseUrl;

  constructor(private httpClient: HttpClient) { }

  public getEmployees(): Observable<Employee[]>{
    return (this.httpClient.get<Employee[]>(`${this.apiServerUrl}/employee/all`));
  }

  public addEmployee(employee: Employee): Observable<Employee>{
    let data =  { "name": employee.name, 
                  "email": employee.email, 
                  "jobtitle": employee.jobtitle, 
                  "phone": employee.phone, 
                  "imageurl": employee.imageurl 
                }   
    return (this.httpClient.post<Employee>(`${this.apiServerUrl}/employee/add`, data));
  }

  public updateEmployee(employee: Employee): Observable<Employee>{
    return (this.httpClient.put<Employee>(`${this.apiServerUrl}/employee/update`, employee));
  }

  public deleteEmployee(Id: number): Observable<void>{
    return (this.httpClient.delete<void>(`${this.apiServerUrl}/employee/delete/${Id}`));
  }

}