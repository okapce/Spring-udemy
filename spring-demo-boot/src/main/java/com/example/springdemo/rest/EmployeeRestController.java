package com.example.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dao.EmployeeDAO;
import com.example.springdemo.entity.Employee;
import com.example.springdemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	//private EmployeeDAO employeeDao; //refactoring  DAO for service
	private EmployeeService employeeService;
	
	//inject employee dao
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		
		employeeService = theEmployeeService;
		
	}
	
	//expose "/employees" en return list
	@GetMapping("/employees")
	public List<Employee> findAll() {
		
		return employeeService.findAll();
		
	}
	
	//mapping for get /employees/{employeeId}
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee theEmployee = employeeService.findById(employeeId);
		
		if (theEmployee ==null) {
			throw new RuntimeException("Employee id not found - "+employeeId);
		}
		
		return theEmployee;
	}
	
	//mapping for post /employees/{employeeId}
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		
			theEmployee.setId(0);
			
			employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	//mapping for put for update
	@PutMapping("/employees/")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
			
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
			
		Employee tempEmployee = employeeService.findById(employeeId);
		
		if (tempEmployee ==null) {
			throw new RuntimeException("Employee id not found - "+employeeId);
		}
		
		employeeService.deleteById(employeeId);
		
		return "Deleted employee Id - "+employeeId;
	}
	
}
