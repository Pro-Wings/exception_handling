package com.prowings.exception_handling;

public class NestedTryCatch4 {
	
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
			finally {
				System.out.println("inside inner finally");
			}
			System.out.println("inside outer try block  2!!!");
		}
		catch (ArithmeticException e) {
			System.out.println("inside outer catch block 1!!!");
			try {
				System.out.println("inside nested try of finally!!");
			}catch (Exception e1) {
				System.out.println("inside nested catch of finally!!");
			}

			System.out.println("inside outer catch block 1!!!");
		}
		catch (Exception e) {
			System.out.println("inside outer catch block 2!!!");
		}
		finally {
			System.out.println("inside outer finally1");
			try {
				System.out.println("inside nested try of finally!!");
			}catch (Exception e) {
				System.out.println("inside nested catch of finally!!");
			}
			finally {
				System.out.println("inside nested finally!!");
			}
			System.out.println("inside outer finally2");
		}

		System.out.println("main method ended!!");
		
	}

}
