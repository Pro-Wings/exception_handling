package com.prowings.exception_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedUncheckedExDemo {
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("main() started!!" );
		
//		int result = 10/0;

		Connection connection = DriverManager.getConnection("");
		
		System.out.println("main() ended!!" );
		
	}

}
