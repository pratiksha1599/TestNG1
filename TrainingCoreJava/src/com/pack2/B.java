package com.pack2;

import com.pack1.A;

public class B extends A {
	public static void main(String[] args) {
		B aobj = new B();
		aobj.i = 20;
		aobj.m1();
		System.out.println(aobj.i = 20);
		//System.out.println(aobj.m1());
	}
}
