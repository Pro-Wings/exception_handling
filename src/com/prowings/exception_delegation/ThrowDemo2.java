package com.prowings.exception_delegation;

public class ThrowDemo2 {

	public static void main(String[] args) {
		System.out.println("main() started!!");
		int result = 0;
		try {
			result = myMethod1(10, 0);
		} catch (Exception e) {
			System.out.println("some exception occurred : " + e.getClass().getName());
			throw new ArithmeticException(e.getMessage());
		}
		System.out.println("Result is : " + result);
		System.out.println("main() ended!!");
	}

	public static int myMethod1(int i, int j) throws NonZeroException {
		int res = 0;

		if (j == 0) {
			throw new NonZeroException("J's value must be non zero!!");
		} else {
			res = i / j;
		}
		return res;
	}

}
