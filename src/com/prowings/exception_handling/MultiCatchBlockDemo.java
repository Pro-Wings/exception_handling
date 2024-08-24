package com.prowings.exception_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiCatchBlockDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		int[] nums = {10,20,30};
		int res = 0;
		try
		{
			System.out.println("inside try--1");
			res = nums[2]/0;
			Connection con = DriverManager.getConnection("");
			System.out.println("Result is  : "+ res);
			System.out.println("inside try--2");
		}
		catch (ArithmeticException | SQLException e) {
			System.out.println("inside catch");
			System.out.println(e.getClass().getName());
		}
		System.out.println("main ended!!");
		
	}

}
