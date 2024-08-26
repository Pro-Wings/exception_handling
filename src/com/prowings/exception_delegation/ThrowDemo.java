package com.prowings.exception_delegation;

public class ThrowDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		m1();
		System.out.println("main ended!!");
		
	}

	private static void m1() {
		System.out.println("m1 started!!");
		m2();
		System.out.println("m1 ended!!");
	}

	private static void m2() {
		System.out.println("m2 started!!");
		int i = 30;
		if(i > 23)
		throw new ArithmeticException("/ divide zero");
		System.out.println("m2 ended!!");
	}

}
