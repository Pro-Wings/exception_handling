package com.prowings.exception_handling;

public class FinallyDemo4 {
	
	public static void main(String[] args) {
		int result = 0;
		int num = 10;
		System.out.println("main method started!!");
		try {
			System.out.println("Hello 1");
			result = num/2;
			System.out.println("Result is : "+result);
			System.out.println("Hello 2");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception occurred!! Can not divide by zero!!");
		}
		catch (Exception e) {
			System.out.println("Exception occurred!!");
		}
		finally {
			System.out.println("inside finally111!!!");
			System.exit(0);
			System.out.println("inside finally222!!!");
		}
		System.out.println("main method ended!!");
		
	}

}
