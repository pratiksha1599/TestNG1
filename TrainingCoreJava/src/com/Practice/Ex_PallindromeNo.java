package com.Practice;

import java.util.Scanner;

public class Ex_PallindromeNo {

	public static void main(String[] args) {
		int sum = 0, temp, r;
		System.out.println("Enter any no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if(temp==sum) {
			System.out.println("no. is palllindrome");
		}
		else {
			System.out.println("not");
		}
	}

}
