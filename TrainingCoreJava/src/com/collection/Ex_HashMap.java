package com.collection;

import java.util.HashMap;

public class Ex_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap();

		obj.put(1, "Apple");
		obj.put(2, "Banana");
		obj.put(3, "Mango");

		System.out.println(obj.get(3));
	}

}
