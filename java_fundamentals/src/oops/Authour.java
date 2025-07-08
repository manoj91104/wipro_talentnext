package oops;
import java.util.*;
public class Authour {

	    private String name;
	    private String email;
	    private char gender;

	
	    public Authour(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public char getGender() {
	        return gender;
	    }

	    // toString method
	    public String toString() {
	        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
	    }
}


