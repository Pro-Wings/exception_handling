package com.prowings.exception_handling.customResource;

public class TryWithResourceDemo {
	
	public static void main(String[] args) {
		
		try(MyResource1 resource1 = new MyResource1(); MyResource2 resource2 = new MyResource2())
		{
			System.out.println("inside try!!");
			int res = 20/0;
			
		} catch (Exception e) {
			System.out.println("inside catch!!");
		}
		
	}

}
