package com.polymorphism;

public class Ex_MethodOverloading {
	public static void main(String[] args) {
       
		Ex_MethodOverloading mto = new Ex_MethodOverloading();
		mto.login("Laxmi", "lsnthrive");
		
		mto.login(7654323456l, "lioyRt&8");
		
	}

	public void login(String s, String p) {
		System.out.println("User can successfully login using id and password to application");
	}

	public void login(long s, String p) {
		System.out.println("User can successfully login through phone no. and password to the application");
	}

}
