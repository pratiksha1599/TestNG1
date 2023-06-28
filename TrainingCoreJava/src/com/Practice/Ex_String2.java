package com.Practice;

public class Ex_String2 {

	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = "XYZ";
		String str3 = "PQR";

//		String s1 = str1.concat(str2);
//		System.out.println(s1.concat(str3));

		str1.concat(str2).concat(str3);
		System.out.println(str1.concat(str2).concat(str3));
	}
}
