package com.federalbank.emp.model;

public class Employee {
	
	private Long id;
	
	private String name;
	
	private String destination;
	
	private String branch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", destination=" + destination + ", branch=" + branch + "]";
	}

}
