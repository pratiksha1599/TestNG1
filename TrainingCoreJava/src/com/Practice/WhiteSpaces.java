package com.Practice;

public class WhiteSpaces {

	public static void main(String[] args) {
		String sentence = "j   ava re mo ve sp a c e";
		System.out.println("Original sentence " +sentence);
		sentence = sentence.replaceAll("\\s", "");
		System.out.println("After replace " +sentence);
	}

}
