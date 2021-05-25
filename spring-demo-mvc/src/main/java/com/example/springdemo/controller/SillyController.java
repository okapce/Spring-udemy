package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	@RequestMapping("/showForm")
	public String displayForm() {
		System.out.println("sillycontroller called");
		return "silly";
	}
}
