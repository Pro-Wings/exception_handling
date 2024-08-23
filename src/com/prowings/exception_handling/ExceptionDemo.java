package com.prowings.exception_handling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		System.out.println("Hiii 1");
		System.out.println("Hiii 2");
		System.out.println("Hiii 3");
		System.out.println("Hiii 4");
		System.out.println("Hiii 5");
		int result = m1();
		System.out.println("Result is : "+result);
		System.out.println("Hiii 6");
		System.out.println("Hiii 7");
		System.out.println("Hiii 8");
		System.out.println("Hiii 9");
		System.out.println("Hiii 10");
		System.out.println("main method ended!!");
		
	}

	public static int m1() {
		System.out.println("m1 method started!!");
		int result = m2();
		System.out.println("m1 method ended!!");
		return result;
	}

	public static int m2() {
		System.out.println("m2 method started!!");
		int result = 10/0;
		System.out.println("m2 method ended!!");
		return result;
	}
	

}
