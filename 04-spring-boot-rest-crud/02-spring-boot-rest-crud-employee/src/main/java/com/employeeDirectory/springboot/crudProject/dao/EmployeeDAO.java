package com.employeeDirectory.springboot.crudProject.dao;

import com.employeeDirectory.springboot.crudProject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
