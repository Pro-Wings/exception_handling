package com.prowings.exception_handling;

public class FinallyDemo3 {
	
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
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("Exception occurred!!");
		}
		finally {
			System.out.println("inside finally!!!");
		}
		System.out.println("main method ended!!");
		
	}

}
