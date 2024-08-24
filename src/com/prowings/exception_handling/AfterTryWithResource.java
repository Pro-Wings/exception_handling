package com.prowings.exception_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AfterTryWithResource {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		Connection con = null;
		try {
			System.out.println("try block started");
			con = DriverManager.getConnection("db url");
			//some DB operation
			
			System.out.println("try block ended");
		}
		catch (SQLException e) {
			System.out.println("sql ex occurred");
					}
		catch (Exception e) {
			System.out.println("some ex occurred");
		}
		finally {
			//code to close con
			try {
				con.close();
			}catch (SQLException e) {
				System.out.println("Error while closing con");
			}
		}
		System.out.println("main ended!!");
		
	}

}
