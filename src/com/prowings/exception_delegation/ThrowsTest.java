package com.prowings.exception_delegation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowsTest {
	
	public static void main(String[] args) throws SQLException{
		System.out.println("main method started!!");
		try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("main method ended!!");
	}

	public static void m1() throws SQLException, IOException{
		
		System.out.println("m1 method started!!");
		m2();
		System.out.println("m1 method ended!!");
		
	}

	public static void m2() throws SQLException{
		
		System.out.println("m2 method started!!");
		//code to connect to DB
		
		//way 1 - Handle ex using try-catch
//		try {
//			Connection connection = DriverManager.getConnection("");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//Way 2 - delegate the exception
		Connection connection = DriverManager.getConnection("");
		
		
		System.out.println("m2 method ended!!");
		
	}

}
