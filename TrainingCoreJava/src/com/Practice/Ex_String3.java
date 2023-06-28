package com.Practice;

public class Ex_String3 {
	public static void main(String[] args) {
		String s = "1324";
		int r,sum=0;
		int n = Integer.parseInt(s);
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;			
		}
		System.out.println("sum: "+sum);
	
	}
}
