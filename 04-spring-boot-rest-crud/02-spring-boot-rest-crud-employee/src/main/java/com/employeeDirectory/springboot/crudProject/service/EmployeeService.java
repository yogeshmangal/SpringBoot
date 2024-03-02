package com.employeeDirectory.springboot.crudProject.service;

import com.employeeDirectory.springboot.crudProject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
