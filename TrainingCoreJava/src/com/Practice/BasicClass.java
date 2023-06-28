package com.Practice;

class MethodOverriding {
	void show() {
		System.out.println("1");
	}
}

class child extends MethodOverriding {
	void show() {
		System.out.println("2");
	}
}

public class BasicClass {
	public void main(String[] args) {
		MethodOverriding mm = new MethodOverriding();
		mm.show();
		
		child cc =new child();
		cc.show();
	}
}
