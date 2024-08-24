package com.prowings.exception_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BeforeTryWithResource {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");

		try(Connection con = DriverManager.getConnection("db url"))
		{
			System.out.println("try block started");
			//some DB operation
			System.out.println("try block ended");
		}
		catch (SQLException e) {
			System.out.println("sql ex occurred");
					}
		catch (Exception e) {
			System.out.println("some ex occurred");
		}

		System.out.println("main ended!!");
		
	}

}
