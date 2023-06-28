package com.JavaExample;

import java.util.Scanner;

public class Ex_SwitchCase {

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value of a ");
		a=sc.nextInt();
		
		System.out.println("Enter a value of b ");
		b=sc.nextInt();
		System.out.println("Please select following option");
		System.out.println("1.Add 2.Sub 3.Mult.");
		
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Addition :"+(a+b));
			break;
		case 2:
			System.out.println("Sub:"+(a-b));
			break;
			
		case 3:
			System.out.println("Mul:"+(a*b));
			
			break;
			default:
				System.out.println("Wrong choice....");
		}
		
	}

}
