package com.JavaExample;

public class Ex_Strings {

	public static void main(String[] args) {
		String s1 = "Welcome";
		System.out.println(s1);
		
		
		String s2 =new String("Happy");
		System.out.println(s2);
		
		
		System.out.println("Length of the string s2:" +s2.length());
	    System.out.println("Lower case :"+s2.toLowerCase());
	    System.out.println("Upper case :"+s2.toUpperCase());
	    
	    System.out.println(s1.concat(s2));
	    
	    String s3 = "Automation";
	    System.out.println(s3.length());
	    System.out.println(s3.trim());
	    String s4 = s3.trim();
	    System.out.println(s4.charAt(4));
	    //contains  
	    
	    System.out.println(s3.contains("om"));
	    System.out.println("-----------------");
	    String s5="welcome";
	    System.out.println(s1.equals(s5));
	    
	    System.out.println(s1.equalsIgnoreCase(s5));
	    
	    //split
	    
	    String s6 = "user,user2,user3";
	    String a[] = s6.split(",");
	    System.out.println(a[2]);
	    
	}

}
