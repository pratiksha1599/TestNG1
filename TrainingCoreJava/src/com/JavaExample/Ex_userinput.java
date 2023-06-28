package com.JavaExample;

import java.util.Scanner;

public class Ex_userinput {

	public static void main(String[] args) {

		int a, b;
		float f;

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a value of a ");
		a = obj.nextInt();

		System.out.println("Enter a value of b ");
		b = obj.nextInt();
		System.out.println("Total is " + (a + b));
	}
}
