package com.DesignPattern;

public class Ex_Singletone {

	
	//constructor private
	private Ex_Singletone() {}
	
	
	//create an instance at load time
	
	private static final Ex_Singletone instance = new Ex_Singletone() ;
	
}
