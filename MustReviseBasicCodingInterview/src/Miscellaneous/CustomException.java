package Miscellaneous;

public class CustomException {

	public static void main(String[] args) {

		try {
			validate(13);
		} catch (InvalidAgeException e) {

			e.printStackTrace();
		}
		
		 System.out.println("rest of the code...");  

	}

	public static void validate(int age) throws InvalidAgeException {

		if (age < 18) {

			throw new InvalidAgeException("not valid");

		} else {

			System.out.println("Valid to vote");
		}

	}

}

class InvalidAgeException extends Exception {

	InvalidAgeException(String msg) {

		super(msg);
	};

}
