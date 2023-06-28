package com.Practice;

public class UpperAndLowercase {

	public static void main(String[] args) {
		String s = "Wlcome to AutomatioN";
		String lower = "";
		String upper = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper = upper + ch;

			} else {
				lower = lower + ch;

			}

		}
		System.out.println("Lower case character: "+lower);
		System.out.println("Upper case character: "+upper);

	}

}
