package com.luv2code.cruddemo;

import com.luv2code.cruddemo.entity.Student;
import com.luv2code.cruddemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return shalu -> {
//			createStudent(studentDAO);
//			createMultipleStudents(studentDAO);
			readStudent(studentDAO);
		};
	}

	public void readStudent(StudentDAO studentDAO) {
		Student student = new Student("Rakhi", "Mangal", "rm@gmail.com");
		studentDAO.save(student);
		int id = student.getId();
		Student myStudent = studentDAO.findById(id);
		System.out.println(myStudent);
	}
	public void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new student object ...");
		Student student = new Student("Rekha", "Garg", "rg@gmail.com");

		System.out.println("Saving the student ...");
		studentDAO.save(student);

		System.out.println("Saved Student. Generated id: " + student.getId());
	}

	public void createMultipleStudents(StudentDAO studentDAO) {
		Student student1 = new Student("jaya", "Singhal", "js@gmail.com");
		Student student2 = new Student("Neha", "Kanaujiya", "nk@gmail.com");
		Student student3 = new Student("Sushma", "khatri", "sk@gmail.com");

		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}
}
