package com.encapsulation;

public class Employee {

	private String stdname;
	private int stdage;
	private int salary;

	public String getName() {
		return stdname;
	}

	public int getAge() {
		return stdage;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.stdname = name;

	}

	public void setAge(int stdage) {
		this.stdage = stdage;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
