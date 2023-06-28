package com.constructor;

public class Ex_Customer {

	public Ex_Customer() {
		System.out.println("constructor");
	}

	public Ex_Customer(int a, String s) {
		System.out.println("my name is:" + s);
	}

	public static void main(String[] args) {

		Ex_Customer ecobj = new Ex_Customer();
		Ex_Customer ecobj1 = new Ex_Customer(2, "Pratiksha");
	}

}
//constructor is same as class name it has no return type
