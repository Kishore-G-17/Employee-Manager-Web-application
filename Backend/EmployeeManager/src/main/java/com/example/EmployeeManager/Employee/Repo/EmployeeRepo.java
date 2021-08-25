package com.example.EmployeeManager.Employee.Repo;

import java.util.Optional;

import com.example.EmployeeManager.Employee.Model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteById(Long id);

    Optional<Employee> findById(Long id);

}