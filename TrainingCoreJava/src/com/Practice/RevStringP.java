package com.Practice;

public class RevStringP {

	public static void main(String[] args) {
	String str = "Dream";
	String revStr = "";
	
	for(int i=str.length()-1;i>=0;i--) {
		revStr = revStr+str.charAt(i);
		
	}
	System.out.println("Orginal String " +str);
	System.out.println("Reverse string "+revStr);
	}

}
