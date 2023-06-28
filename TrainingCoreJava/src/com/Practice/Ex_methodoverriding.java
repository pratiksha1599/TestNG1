package com.Practice;

public class Ex_methodoverriding {
	
	
	
	
	void show1() {
		System.out.println("1");
		
		
	}
}

	class Bike extends Ex_methodoverriding {
		void show1() {
			System.out.println("2");
		}
	
	
	 
		public static void main(String[] args) {
			Ex_methodoverriding sm = new Ex_methodoverriding();
			sm.show1();
			
			Bike bb = new Bike();
			bb.show1();

	
	}

}
