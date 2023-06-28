package com.JavaExample;

public class SwapNo {

	public static void main(String[] args) {

		int a = 12, b = 13;
		System.out.println("before Swapping :" + a + " " + b + " ");
		a = a + b; // 12+13=25
		b = a - b; //
		a = a - b;

		System.out.println("Afetr Swapping :" + a + " " + b + " ");

		System.out.println("--------Logical Operators-----------");
		boolean x = true;
		boolean y = true;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
	}

}
