package com.example.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springdemo.dao.EmployeeDAO;
import com.example.springdemo.dao.EmployeeRepository;
import com.example.springdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//refactoring EmployeeDAO to EmployeeRepository
	//private EmployeeDAO employeeDAO;
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
								//@Qualifier("employeeDAOJPAImpl") EmployeeDAO theEmployeeDAO) { 
											//careful to lowercase Bean
		//employeeDAO =theEmployeeDAO;
		employeeRepository = theEmployeeRepository;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
				//employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepository.findById(theId);
		
		Employee theEmployee =null;
		if(result.isPresent()) {
			
			theEmployee=result.get();
			
		}
		return theEmployee;
				//employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
		
		//employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
		//employeeDAO.deleteById(theId);

	}

}
