package com.Practice;

public class UpperAndLowercase_Count {

	public static void main(String[] args) {
		String s = "Wlcome to AutomatioN";
		int lower = 0;
		int upper = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
				upper = upper + ch;
			} else {

				lower++;
			}

		}
		System.out.println("Lower case character length: " + lower);
		System.out.println("Upper case character length: " + upper);

	}

}
