package com.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<Employee>();
		for (int i=1;i<=3;i++) {
			System.out.println("Enter the Employee " + i +"'s details " );
			System.out.println();
			System.out.println("Enter the employee "+ i+"'s ID:" );
			int eid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the employee "+ i+"'s name:");
			String ename = sc.nextLine();
			System.out.println("Enter the department details for Employee "+ i +" :");
			System.out.println();
			System.out.println("Enter the ID :");			
			int did = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the department name :");
			String dname = sc.nextLine();
			System.out.println("Enter the designation :");
			String designation = sc .nextLine();
			
			Department  dept = new Department(did, dname, designation);
			Employee  emp = new Employee(eid, ename, dept);
			
			al.add(emp);
			
		}
		sc.close();
		for(Employee emps :al) {
			emps.empDetails();
			System.out.println();
		}
}
}
