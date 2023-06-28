package com.JavaExample;

class Empl {
	private int empid;

	public void set_empid(int empid) {
		this.empid = empid;

	}

	public int get_empid() {
		return empid;
	}
}

public class Company {

	public static void main(String[] args) {
		Empl emp = new Empl();
		emp.set_empid(120);
		System.out.println(emp.get_empid());
	}

}
