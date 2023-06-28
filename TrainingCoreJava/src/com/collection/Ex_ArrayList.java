package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Merry");
		list.add("Rajasi");
		list.add("john");
		list.add("shree");

		System.out.println(list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
