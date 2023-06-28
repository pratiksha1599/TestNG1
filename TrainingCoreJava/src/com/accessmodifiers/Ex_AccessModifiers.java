package com.accessmodifiers;
/*private: only accescible within the class
 * default: don't specify any kind of access modifiers (acccible only within the package/not accesible ouside thepackage)
 * protected:Accesle within the package and outside of the package but thought inheritance
 * public:
 */

class A/*
		 * {
		 * 
		 * private int i = 10;
		 * 
		 * private void m1() { System.out.println(i); }
		 * 
		 * }
		 */ {
	int i = 10;

	void m1() {
		System.out.println(i);
	}
}

public class Ex_AccessModifiers {

	public static void main(String[] args) {
		A aobj = new A();
		// aobj.m1(); //cannot access since it is private
		// aobj.i = 23; // cannot access since it is private
		aobj.m1();
		aobj.i = 23;

	}
}
