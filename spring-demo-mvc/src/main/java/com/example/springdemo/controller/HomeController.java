package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	//@ResponseBody	//views return only
	public String showPage() {
		System.out.println("Running Home Page");
		return "main-menu";
	}
}
