package com.Practice;

class Animal {
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	void bdd() {
		System.out.println("bark");
	}
}

public class Ex_Inheritance {
	public static void main(String[] args) {
		Dog dd =new Dog();
		dd.bdd();
		dd.eat();
		
	  Animal a = new Dog();
	  a.eat();
	  
		
		
	}
}
