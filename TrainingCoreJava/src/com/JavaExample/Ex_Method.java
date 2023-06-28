package com.JavaExample;

public class Ex_Method {
	public static void main(String[] args) {

		Ex_Method obj = new Ex_Method();
		obj.mymethod();
		System.out.println(obj.addtn(5, 5));

		int sum = obj.addtn(1, 1);
		System.out.println(sum);
	}

	public void mymethod() {
		System.out.println("This is my method");
	}

	public int addtn(int a, int b) {
		return a + b;

	}
}
