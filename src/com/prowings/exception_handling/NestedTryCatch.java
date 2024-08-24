package com.prowings.exception_handling;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		int res = 0;
		try
		{
			System.out.println("inside outer try block  1!!!");
			try
			{
				System.out.println("inside nested try block  1!!!");
				res = 10/0;
				System.out.println("inside nested try block  2!!!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inside nested catch block!!!");
			}
			System.out.println("inside outer try block  2!!!");
		}
		catch (NullPointerException e) {
			System.out.println("inside outer catch block!!!");
		}
		
		System.out.println("main method ended!!");
		
	}

}
