package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> studentList;

    @PostConstruct
    public void loadData() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Yogesh", "Mangal"));
        studentList.add(new Student("Aman", "Gupta"));
        studentList.add(new Student("Sagar", "Gulati"));
        studentList.add(new Student("Maneesh", "Agrahari"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    @GetMapping("/student/{id}")
    public Student getStudentByID(@PathVariable int id) {
        if (id >= studentList.size() || id < 0) {
            throw new StudentNotFoundException("Student id not found - " + id);
        }
        return studentList.get(id);
    }
}
