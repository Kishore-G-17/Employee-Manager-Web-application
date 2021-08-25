package com.example.EmployeeManager.Repo;

import java.util.Optional;

import com.example.EmployeeManager.Model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}