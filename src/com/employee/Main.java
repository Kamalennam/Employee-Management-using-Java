package com.employee;

import java.util.Scanner;

public class Main {
	static boolean ordering = true;
	public static void menu() {
		System.out.println("Welcome To The Employee Management"
				+"\n"
				+ "\n1. Add Employee"
				+ "\n2. View Employee"
				+ "\n3. Update Employee"
				+ "\n4. Delete Employee"
				+ "\n5. View All Employees"
				+ "\n6. Exit");
		System.out.println("");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		menu();
		do {
			System.out.println("");
			System.out.println("Enter your choice...");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("Add Employee");
					service.addEmployee();
					break;
				
				case 2: 
					System.out.println("View Employee");
					System.out.println("");
					service.viewEmployee();
					break;
				
				case 3: 
					System.out.println("Update Employee");
					System.out.println("");
					service.updateEmployee();
					break;
				
				case 4: 
					System.out.println("Delete Employee");
					System.out.println("");
					service.deleteEmployee();
					break;
				
				case 5: 
					System.out.println("View All Employees");
					System.out.println("");
					service.viewAllEmployees();
					break;
				
				case 6: 
					System.out.println("Thanks for coming..!!");
					System.exit(0);
					
				default:
					System.out.println("Please enter a valid choice from above");
			}
		
		
			
			
		}while(ordering);

	}

}
