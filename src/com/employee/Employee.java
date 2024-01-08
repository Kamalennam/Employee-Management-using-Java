package com.employee;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String Sex;
	private String designation;
	private double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Sex=" + Sex + ", designation="
				+ designation + ", Salary=" + Salary + "]";
	}
	public Employee(int id, String name, int age, String sex, String designation, double salary) {
		super();
		this.id = id;
		this.name= name;
		this.age = age;
		this.Sex = sex;
		this.designation = designation;
		this.Salary = salary;
		
	}
	
}
