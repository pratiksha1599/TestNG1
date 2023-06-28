package com.JavaExample;

interface printable {
	void print();
}

interface showable {
	void show();
}

public class Ex_Interface implements printable {

	public void print() {
		System.out.println("Printing.......");
	}

	public void show() {
		System.out.println("showing----");
	}

	public static void main(String[] args) {
		Ex_Interface obj = new Ex_Interface();
		obj.print();
		obj.show();

	}

}
