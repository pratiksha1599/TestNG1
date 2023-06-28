package com.JavaExample;

public class Ex_ExceptionHandling {
	public static void main(String[] args) throws InterruptedException {

	int a =10, ans;
	try {
	ans = a/0;
	System.out.println("Ans is"+ans);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}finally {
		System.out.println("yes I am here");
	}
	
	Thread.sleep(2000);
	System.out.println("bye");
	}
}
