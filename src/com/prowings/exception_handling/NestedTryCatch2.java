package com.prowings.exception_handling;

public class NestedTryCatch2 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		int[] nums = {10,20,30};
		int res = 0;
		try
		{
			System.out.println("inside outer try block  1!!!");
			res = nums[2]/2;
			System.out.println("Result : "+res);
			try
			{
				System.out.println("inside inner try block  1!!!");
				res = 10/0;
				System.out.println("Result : "+res);
				System.out.println("inside inner try block  2!!!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inside inner catch block!!!");
			}
			System.out.println("inside outer try block  2!!!");
		}
		catch (ArithmeticException e) {
			System.out.println("inside outer catch block 1!!!");
		}
		catch (Exception e) {
			System.out.println("inside outer catch block 2!!!");
		}
		
		System.out.println("main method ended!!");
		
	}

}
