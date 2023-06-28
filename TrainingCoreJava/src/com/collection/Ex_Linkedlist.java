package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex_Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Jay");
		al.add("Ravi");
		al.add("aji");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
	}

}
