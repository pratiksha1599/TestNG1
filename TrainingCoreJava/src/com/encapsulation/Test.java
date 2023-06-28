package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		Employee eobj = new Employee();
		eobj.setName("Pratiksha");
		
		eobj.setAge(23);
		eobj.setSalary(50000);
		System.out.println(eobj.getName());
		System.out.println(eobj.getAge());
        System.out.println(eobj.getSalary());	
	}

}
