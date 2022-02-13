package com.federalbank.emp.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.federalbank.emp.model.Employee;
import com.federalbank.emp.restservice.service.EmployeeService;
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		
		return service.findAllEmployees();
		
	}
	

}
