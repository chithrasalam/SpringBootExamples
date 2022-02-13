package com.federalbank.emp.restservice.jpa;

import java.util.ArrayList;
import java.util.List;

import com.federalbank.emp.model.Employee;

public class EmployeeJPARepositoryImpl {
	
	public List<Employee> findAllEmployees()
	{
		//Actual DB call here
		
		Employee emp1 =new Employee();
		emp1.setId(new Long(1));
		emp1.setName("Test1");
		
		Employee emp2 =new Employee();
		emp2.setId(new Long(2));
		emp2.setName("Test2");
		
		Employee emp3 =new Employee();
		emp3.setId(new Long(3));
		emp3.setName("Test3");
		emp3.setBranch("Ernakulam");
		emp3.setDestination("Kerala");
		
		List<Employee> emplListTest = new ArrayList<Employee> ();
		emplListTest.add(emp1);
		emplListTest.add(emp2);
		emplListTest.add(emp3);
		
		return emplListTest;
		
		
	}

}
