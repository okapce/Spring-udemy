package com.example.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
