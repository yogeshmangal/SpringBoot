package com.luv2code.cruddemo;

import com.luv2code.cruddemo.entity.Student;
import com.luv2code.cruddemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return shalu -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
//			findListOfStudents(studentDAO);
//			findByLastNameOfStudent(studentDAO);
//			updateStudent(studentDAO);
//			updateMultipleStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteManyStudents(studentDAO);
		};
	}

	public void deleteManyStudents(StudentDAO studentDAO) {
		int rowsDeleted = studentDAO.deleteMany();
		System.out.println(rowsDeleted);
	}

	public void deleteStudent(StudentDAO studentDAO) {
		Student tempStudent = studentDAO.findById(1);
		studentDAO.deleteStudent(1);
		System.out.println("Deleted Student is: " + tempStudent);
	}

	public void updateMultipleStudent(StudentDAO studentDAO) {
		int count = studentDAO.updateMany();
		System.out.println(count);
	}

	public void updateStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(2);
		student.setLastName("Mittal");
		studentDAO.update(student);
	}
	public void findByLastNameOfStudent(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findByLastName("Mangal");
		for(Student student : studentList) {
			System.out.println(student);
		}
	}

	public void findListOfStudents(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findAllStudents();
		for(Student student : studentList) {
			System.out.println(student);
		}
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
