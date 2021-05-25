package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springdemo.entities.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("showForm")
	public String showForm(Model model) {
		//student object creation
		Student student = new Student();
		
		//add student object model
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());
		
		return "student-confirmation";
	}
}
