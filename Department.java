package com.Employee;

public class Department {
	int did;
	String dname;
	String designation;
	
	public Department(int did, String dname, String designation) {
		super();
		this.did = did;
		this.dname = dname;
		this.designation = designation;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public String getDesignation() {
		return designation;
	}

	public  void deptDetails() {
		System.out.println("Department ID : " + getDid()  );
		System.out.println("Department name :" + getDname());
		System.out.println("Designation is :" + getDesignation());
		
	}
}
