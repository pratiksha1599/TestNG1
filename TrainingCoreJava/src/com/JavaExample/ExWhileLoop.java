package com.JavaExample;

public class ExWhileLoop {
	public static void main(String[] args) {
    int i=1;
    int ecout=0;
    int ocount=0;
    while(i<=10) {
    	if(i%2==0) {
    		System.out.println("no is even"+i);
    		ecout++;
    	}
    	else {
    		System.out.println("odd"+i);
    		ocount++;
    	}
    	
    	i++;
    }
   
    System.out.println("Even no.s "+ecout);
    System.out.println("odd no.s "+ocount);
    
	}
}
