package com.JavaExample;

import java.util.Scanner;

public class MultplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = 0;
		System.out.println("Enter no: ");
		int a = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			//System.out.println(a * i);
			//System.out.println("******************");
			
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}
