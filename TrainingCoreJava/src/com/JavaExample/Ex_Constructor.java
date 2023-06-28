package com.JavaExample;

public class Ex_Constructor {

	public static void main(String[] args) {

		Ex_Constructor obj = new Ex_Constructor();
		Ex_Constructor obj1 = new Ex_Constructor("Welcome");

	}

	public Ex_Constructor() {
		System.out.println("This is default constructor");
	}

	public Ex_Constructor(String msg) {
		System.out.println("This is parametrized constructor");
	}
}
