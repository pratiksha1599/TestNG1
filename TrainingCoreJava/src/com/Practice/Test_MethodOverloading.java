package com.Practice;

public class Test_MethodOverloading {

	//method overloading
	void show() {
		System.out.println("hello");
	}
	void show(int a) {
		System.out.println("hi");
	}
	void show(int a,String s) {
		System.out.println("String value");
	}
	public static void main(String[] args) {
		Test_MethodOverloading tst = new Test_MethodOverloading();
		tst.show(10);
		tst.show();
		tst.show(20, "pratiksha");
		}
}
