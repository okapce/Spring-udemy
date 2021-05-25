package com.example.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller to read form data and add data to the model
	@RequestMapping("/processForm2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read request params from html form
		String theName = request.getParameter("studentName");
		
		//convert data to  all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "yo! "+ theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("studentName") String theName, Model model) {
		
		//convert data to  all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey there, "+ theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
}
