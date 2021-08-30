package com.example.EmployeeManager.Employee.Service;

import java.util.List;

import com.example.EmployeeManager.Employee.Model.Employee;
import com.example.EmployeeManager.Employee.Repo.EmployeeRepo;
import com.example.EmployeeManager.Employee.ExceptionHandler.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        System.out.println("In service: " + employee);
        return this.employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return this.employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    public void deleteEmployee(Long Id) {
        this.employeeRepo.deleteEmployeeById(Id);
    }

    public Employee findEmployee(Long Id) {
        return this.employeeRepo.findEmployeeById(Id)
                .orElseThrow(() -> new UserNotFoundException("user with id " + Id + " was not found"));
    }

}