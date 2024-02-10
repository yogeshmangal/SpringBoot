package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAllStudents();
    List<Student> findByLastName(String theLastName);
    void update(Student theStudent);
    int updateMany();
    void deleteStudent(Integer id);
    int deleteMany();

}
