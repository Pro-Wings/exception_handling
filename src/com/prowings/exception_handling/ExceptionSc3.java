package com.prowings.exception_handling;

public class ExceptionSc3 {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		
		int result =0;
		try {
			result = 10/2;
		}
		catch (ArithmeticException e) {
			System.out.println("Exception occurred while dividing!!!");
			System.out.println("Can not divide with zero!!!");
		}
		System.out.println("Result is  : "+ result);
		System.out.println("Hello 6");
		System.out.println("Hello 7");
		System.out.println("Hello 8");
		System.out.println("Hello 9");
		System.out.println("Hello 10");
		
		System.out.println("main method ended!!");
	}

}
