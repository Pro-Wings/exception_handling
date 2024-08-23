package com.prowings.exception_handling;

public class ReturnInTryCatchFinally {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		int result = divide(10, 0);
		System.out.println("Division is : "+result);
		System.out.println("main method ended!!");
	}

	public static int divide(int i, int j) {
		System.out.println("divide() method started!!");
		int result = 0;
		try {
			result = i/j;
			return 10;
		}catch (ArithmeticException e) {
			System.out.println("Can not divide by zero.. please enter non zero denominator!!");
			return 20;
		}
		finally {
			System.out.println("inside Finally block!!");
			return 40;
		}
	}

}
