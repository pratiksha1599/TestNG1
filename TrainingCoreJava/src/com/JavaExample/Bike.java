package com.JavaExample;
//Example of method overriding -same method name same parameter

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

public class Bike extends Vehicle {
	
	
	public void run() {
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		
		Bike obj =new Bike();
		obj.run();
		
	}

}
