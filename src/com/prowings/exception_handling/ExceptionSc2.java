package com.prowings.exception_handling;

public class ExceptionSc2 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		int[] nums = {10,20,30};
		int result = 0;
			
			result = nums[2]/0;
			System.out.println("Result is : "+result);
		
		System.out.println("main method ended!!");
		
	}

}
