package com.JavaExample;

public class Ex_Overloading {

	
	public static void main(String[] args) {
		Ex_Overloading obj = new Ex_Overloading();
		obj.addtn(12, 12);
		obj.addtn(0, 11,12);
		obj.addtn(12,12.3f);
		
		
	}
	public void addtn(int a,int b) {
	  System.out.println("Sum of Two nos "+(a+b));
	  
	  
	}
	
	public void addtn(int a, int b, int g) {
		System.out.println("Sum of three nos "+(a+b+g));
		  
	}
	
	public void addtn(int a, float c) {
		System.out.println("Sum of Two nos "+(a+c));
		  
	}
}
