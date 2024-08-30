package com.prowings.customexception;

public class UseCustomException {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		boolean result = false;
		try {
			result = validateStudent(10, "Ram123", "Pune", 19);
		} catch (InvalidNameException e) {
			System.out.println("Some Error while validating Student Name...");
			e.printStackTrace();
		}
		catch (InvalidAgeException e) {
			System.out.println("Some Error while validating Student Age...");
			e.printStackTrace();
		}

		if (result == true)
			System.out.println("Student validated successfully!!!");
		else
			System.out.println("student not validated successfully!!");
		System.out.println("main method ended!!");

	}

	public static boolean validateStudent(int roll, String name, String address, int age) throws InvalidNameException {
		boolean result = false;
		if ((isValidAge(age)) && (isValidName(name))) {
			Student std = new Student(roll, name, address, age);
			System.out.println("Saving Student : " + std);
			result = true;
		}
		return result;
	}

	private static boolean isValidName(String name) throws InvalidNameException {
		boolean res = false;
		int nameLength = 0;
		if (name != null) {
			nameLength = name.length();
			if ((nameLength >= 5 && nameLength <= 10)) {
				System.out.println("name has valid length!!");
				if (isNameWithoutDigits(name)) {
					System.out.println("Name dont have any digits!!");
					res = true;
				} else
					throw new InvalidNameException("Invalid Name - Digit not allowed in name!!");
			} else
				throw new InvalidNameException("Invalid Name - index must range from 5 to 10!!");

		}
		return res;

	}

	private static boolean isValidAge(int age) {
		boolean result = false;
		if (age >= 18)
			result = true;
		else
			throw new InvalidAgeException("Invalid Age!!!");

		return result;
	}

	private static boolean isNameWithoutDigits(String name) {
		char[] nameChars = name.toCharArray();
		for (char c : nameChars) {
			if (Character.isDigit(c))
				return false;
		}
		return true;
	}
}
