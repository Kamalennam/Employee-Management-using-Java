package com.employee;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	HashSet<Employee> empset = new HashSet<Employee>();
	
	Employee emp1 = new Employee( 1 , " kamal ",  22 , " Male ", " Developer ", 20000);
	Employee emp2 = new Employee( 2 , " Sridhar" , 22 , " Male ", " Editor" , 20000);
	Employee emp3 = new Employee( 3 , " Chandhu ", 22 , " Male ", " Tester ", 20000);
	Employee emp4 = new Employee( 4 , " Raj Kumar ", 24, " Male ", " Director ", 20000);
	Employee emp5 = new Employee( 5 , " Sathish ", 24, " Male ", " Jr.Editor ", 20000);
	Employee emp6 = new Employee( 6 , " Venu ",  20 , " Male ", " New Folk ", 20000);
	
	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String sex;
	String designation;
	double salary;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		empset.add(emp6);
	}

	//view all employees
	public void viewAllEmployees() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	
	//view a employee
	public void viewEmployee() {
		System.out.println("Enter a id:");
		for(Employee emp:empset) {
			if(emp.getId()  == id) {
				System.out.println("The id "+ id + " details are " + emp);
				found = true;
			}	
		}
		if(!found) System.out.println("The " + id + " is not available..!!");
	}
	//update an employee
			public void updateEmployee() {
				id = sc.nextInt();
				for(Employee emp:empset) {
					if(emp.getId()==id) {
						System.out.println("Enter the details:");
						name = sc.next();
						emp.setName(name);
						age = sc.nextInt();
						emp.setAge(age);
						designation = sc.next();
						emp.setDesignation(designation);
						salary = sc.nextInt();
						emp.setSalary(salary);
						System.out.println("The Updated details are:");
						System.out.println(emp);
						found = true;
					}
				}
				if(!found) System.out.println("The " + id + " is not available..!!");
			}
	
			//delete employee
			public void deleteEmployee() {
				System.out.println("Select an Id:");
				id = sc.nextInt();
				Employee employee = null; 
				for(Employee emp:empset) {
					if(emp.getId()==id) {
						employee = emp;
						found=true;
					}
				}
				if(!found) {
					System.out.println("The " + id + " is not available..!!");
				}else {
					empset.remove(employee);
					System.out.println("Deleted Suucessfully..!!");
				}
				
				
			}
			//add an employee
			public void addEmployee() {
						System.out.println("Enter Id:" );
						 id=sc.nextInt();
						 
						 System.out.println("Enter Name:");
						 name = sc.next();
						 
						 System.out.println("Enter Age:");
						 age=sc.nextInt();
						 
						 System.out.println("Enter Sex:");
						 sex= sc.next();
						 
						 System.out.println("Enter Designation:");
						 designation= sc.next();
						 
						 System.out.println("Enter Salary:");
						 salary = sc.nextDouble();
						 
						 
				Employee emp = new Employee(id, name, age, sex, designation, salary); 
						 empset.add(emp);
						 System.out.println(emp);
						 System.out.println("Employee Addedd Successfullyy..!!");
						
					
				
			}
	
}
