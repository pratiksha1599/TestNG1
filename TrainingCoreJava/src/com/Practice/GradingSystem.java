package com.Practice;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {

		
		System.out.println("Enter your marks:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n>100) {
			System.out.println("Wrong data");
		}
		else if(n>=90 && n<80) {
			System.out.println("Student have A+ grade");
		}
		
		else if(n>=80 && n<90) {
			System.out.println("Student have A grade");
		}
		
		else if(n>=70 && n<80) {
			System.out.println("Student have B grade");
		}
		
		else if(n>=60 && n<70) {
			System.out.println("Student have C grade");
		}
		
		else if(n>=50 && n<60) {
			System.out.println("Student have D grade ");
			
		}
		else
		{
			System.out.println("student failed");
		}
		
	}
}
