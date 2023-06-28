package com.JavaExample;

import java.util.Scanner;

public class SumOfNo {

	public static void main(String[] args) {
		int sum=0,r,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a no: ");
		int n = sc.nextInt();
	    while(n!=0) {
	    	r=n%10;
	    	sum=sum+r;
	    	n=n/10;
	    }
	    System.out.println(sum);
	}

}
