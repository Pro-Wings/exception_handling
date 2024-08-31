package com.prowings.exception_handling;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static com.prowings.exception_delegation.StaticImportSample.age;
import static com.prowings.exception_delegation.StaticImportSample.hello;

public class ImportsDemo {
	
	public static void main(String[] args) throws SQLException {
		
		Date d1 = null;
		Date d2 = null;
		String s1 = new String();
		Integer i = 10;
		
		com.prowings.exception_delegation.ThrowDemo obj = null;
		
		double area = PI * sqrt(4);
		
		int ag = age;
		System.out.println(ag);
		hello();
		
	}

}
