package com.learninglogic.oops;

public class Employee {

	private int rollNo;
	private String name;
	private int age;

	/**
	 * 
	 */
	public Employee() {
		
	}

	/**
	 * @param rollNo
	 * @param name
	 */
	public Employee(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	/**
	 * @param rollNo
	 * @param name
	 * @param age
	 */
	public Employee(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	/**
	 * @param employee
	 */
	public Employee(Employee employee) {
		this.rollNo = employee.rollNo;
		this.name = employee.name;
		this.age = employee.age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	@Override
	public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

}
