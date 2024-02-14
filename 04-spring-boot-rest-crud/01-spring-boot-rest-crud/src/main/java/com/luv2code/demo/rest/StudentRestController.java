package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Yogesh", "Mangal"));
        studentList.add(new Student("Aman", "Gupta"));
        studentList.add(new Student("Sagar", "Gulati"));
        studentList.add(new Student("Maneesh", "Agrahari"));
        return studentList;
    }
}
