package com.prowings.exception_handling;

public class ExceptionSc {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		int[] nums = {10,20,30};
		int result = 0;
		try {
			System.out.println("Hii1");
			result = nums[3]/0;
			System.out.println("Hii2");
			System.out.println("Hello");
			System.out.println("Result is : "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by zero!!");
		}
		catch(Exception e)
		{
			System.out.println("some exception occurred - Exception!!");
		}
		catch(Throwable e)
		{
			System.out.println("some exception occurred - Throwable!!");
		}
		finally {
			System.out.println("inside finally block!!!");
		}
		
		System.out.println("main method ended!!");
		
	}

}
