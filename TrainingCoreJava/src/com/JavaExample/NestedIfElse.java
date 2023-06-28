package com.JavaExample;

public class NestedIfElse {

	
	public static void main(String[] args) {
		int a=10,b=5,c=86;
		if(a>b && a>c) {
			System.out.println("a is greater "+a);
		}
		else if(b>c) {
			System.out.println("b is greater "+b);
		}
		else {
			System.out.println("C is greater "+c);
		}
		
	}
}


/* if(a>b && a>c){
 * a is greatest
 * else if(b>a && b>c)
 * b id greatest
 * 
 * else
 * c is greatest*/



