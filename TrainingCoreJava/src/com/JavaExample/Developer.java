package com.JavaExample;

class Employee {
	int basicsal = 40000;
}

class Tester extends Employee {
	int tbouns = 15000;
}

public class Developer extends Tester {

	int dbouns = 10000;

	public static void main(String[] args) {

		Developer obj = new Developer();
		int totalSaldev = obj.dbouns + obj.basicsal;
		System.out.println("Developers sal " + totalSaldev);
		
		int totalsalTester =obj.tbouns+obj.basicsal;
		System.out.println("Tester sal "+totalsalTester);
		
	}

}
