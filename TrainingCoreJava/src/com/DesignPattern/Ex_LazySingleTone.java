package com.DesignPattern;

public class Ex_LazySingleTone {

	private Ex_LazySingleTone() {
	}

	private static Ex_LazySingleTone instance;

	public static Ex_LazySingleTone getInstance() {

		if (instance == null) {
			return instance = new Ex_LazySingleTone();

		} else {
			return instance;
		}

	}
}
