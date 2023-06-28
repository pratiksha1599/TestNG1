package com.abstarction;

public class Circle extends Shapes {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawShape();
		c.colorofShape();
		c.moveShape();
		
		Shapes.moveShape();
		
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing circle");
	}

	@Override
	public void colorofShape() {
		System.out.println("Colouring circle");

	}

//	@Override
//	public void moveShape() {
//		System.out.println("Moving circle");
//
//	}

}
