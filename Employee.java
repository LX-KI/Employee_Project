package com.Employee;

public class Employee {
	int eid;
	String ename;
	Department department;
	
	public Employee(int eid, String ename, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public Department getDepartment() {
		return department;
	}
	public void empDetails() {
		System.out.println("The details of the employee are as below: ");
		System.out.println("Employee id is : " + getEid());
		System.out.println("Name of the Employee is: " + getEname());
		
		department.deptDetails();
	}
	
}
