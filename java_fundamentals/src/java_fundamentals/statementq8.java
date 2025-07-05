package java_fundamentals;
import java.util.*;

public class statementq8 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a color code (R, G, B, Y, P):");
	        String code = scanner.next().toUpperCase(); // converts to uppercase for safety

	        String color;

	        switch (code) {
	            case "R":
	                color = "Red";
	                break;
	            case "G":
	                color = "Green";
	                break;
	            case "B":
	                color = "Blue";
	                break;
	            case "Y":
	                color = "Yellow";
	                break;
	            case "P":
	                color = "Purple";
	                break;
	            default:
	                color = "Invalid color code!";
	        }

	        System.out.println("Color is: " + color);
	    
	}


}
