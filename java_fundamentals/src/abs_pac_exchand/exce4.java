package abs_pac_exchand;

public class exce4 {
	class InvalidCountryException extends Exception {
	    public InvalidCountryException() {
	        super("User Outside India cannot be registered");
	    }

	    public InvalidCountryException(String message) {
	        super(message);
	    }
	}

	public class UserRegistration {

	    public void registerUser(String username, String userCountry) throws InvalidCountryException {
	        if (!userCountry.equalsIgnoreCase("India")) {
	            throw new InvalidCountryException();
	        } else {
	            System.out.println("User registration done successfully");
	        }
	    }

	    public static void main(String[] args) {
	        UserRegistration reg = new UserRegistration();
	        try {
	            reg.registerUser("Mickey", "US");
	        } catch (InvalidCountryException e) {
	            System.out.println("InvalidCountryException should be thrown.");
	            System.out.println("The message should be \"" + e.getMessage() + "\"");
	        }

	        try {
	            reg.registerUser("Mini", "India");
	        } catch (InvalidCountryException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


}
