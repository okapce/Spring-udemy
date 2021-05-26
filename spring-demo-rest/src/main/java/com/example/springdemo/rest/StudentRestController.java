package com.example.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;
	
	@PostConstruct
	public void loadData() {
		students = new ArrayList<>();
		
		students.add(new Student("nick", "pantin"));
		students.add(new Student("rick", "puppet"));
		students.add(new Student("dick", "rodent"));
	}
	
	//define endpoint for /students -return list students
	@GetMapping("/students")
	public List<Student> getStudents(){

		return students;
		
	}
	
	//define endpoint for students/{studentid} returning student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {	
				
		//check studentID against list size
		if((studentId >= students.size()) || (studentId < 0)) {
			throw new StudentNotFoundException("Student id not found - "+studentId);
		}
		
		return students.get(studentId);
		
	}
	
}
