package com.employeeDirectory.springboot.crudProject.service;

import com.employeeDirectory.springboot.crudProject.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
