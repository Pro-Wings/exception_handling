package com.prowings.exception_handling.customResource;

public class MyResource2 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("inside close() of MyResource2222!!!");
		
	}

}
