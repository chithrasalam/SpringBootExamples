package com.federalbank.emp.restservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.federalbank.emp.model.Employee;
import com.federalbank.emp.restservice.jpa.EmployeeJPARepositoryImpl;
@Service
public class EmployeeService {
	
	public List<Employee> findAllEmployees()
	{
		//JPA also shd be autowired / gt from factory
		return new EmployeeJPARepositoryImpl().findAllEmployees();
		
	}

}
