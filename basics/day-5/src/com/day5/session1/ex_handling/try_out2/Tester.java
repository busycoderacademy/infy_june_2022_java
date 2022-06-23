package com.day5.session1.ex_handling.try_out2;

class ValidationException extends RuntimeException {
	public ValidationException(String message) {
		super(message);
	}
}

class AgeValidator {

	
	public void checkAge(int age){
		if (age > 19) {
			throw new ValidationException("Not eligible to be selected");
		} else {
			System.out.println("Eligible to to be selected");
		}
	}
}

class Tester {

	public static void main(String[] args) {
		AgeValidator validator = new AgeValidator();
		int[] ageList = { 15, 16, 18, 17, 19, 20, 14, 15 };
		for (int index : ageList) {
			try {
				validator.checkAge(index);
			} catch (ValidationException e) {
				// Uncomment below line to understand the flow of the exception
				// e.printStackTrace();
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

}