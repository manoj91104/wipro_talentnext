package abs_pac_exchand;

public class exce5 {
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class AgeValidator {
	    public static void main(String[] args) {
	        try {
	            if (args.length != 2) {
	                System.out.println("Error: Please provide name and age as command line arguments.");
	                return;
	            }

	            String name = args[0];
	            int age;

	            try {
	                age = Integer.parseInt(args[1]);
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Age must be a valid number.");
	                return;
	            }

	            if (age < 18 || age >= 60) {
	                throw new InvalidAgeException("Error: Age must be between 18 and 59.");
	            }

	            System.out.println("Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Registration successful.");

	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


}
