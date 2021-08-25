package com.example.EmployeeManager.Service;

import java.util.List;
import java.util.UUID;

import com.example.EmployeeManager.ExceptionHandler.UserNotFoundException;
import com.example.EmployeeManager.Model.Employee;
import com.example.EmployeeManager.Repo.EmployeeRepo;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    // @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
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