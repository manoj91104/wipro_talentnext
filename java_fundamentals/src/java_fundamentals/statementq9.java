package java_fundamentals;
import java.util.*;

public class statementq9 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month name: ");
	        String month = scanner.nextLine().toLowerCase(); // Convert to lowercase for matching

	        int monthNumber;

	        switch (month) {
	            case "january":
	                monthNumber = 1;
	                break;
	            case "february":
	                monthNumber = 2;
	                break;
	            case "march":
	                monthNumber = 3;
	                break;
	            case "april":
	                monthNumber = 4;
	                break;
	            case "may":
	                monthNumber = 5;
	                break;
	            case "june":
	                monthNumber = 6;
	                break;
	            case "july":
	                monthNumber = 7;
	                break;
	            case "august":
	                monthNumber = 8;
	                break;
	            case "september":
	                monthNumber = 9;
	                break;
	            case "october":
	                monthNumber = 10;
	                break;
	            case "november":
	                monthNumber = 11;
	                break;
	            case "december":
	                monthNumber = 12;
	                break;
	            default:
	                monthNumber = -1; // Invalid input
	        }

	        if (monthNumber != -1) {
	            System.out.println("Month number for " + month + " is: " + monthNumber);
	        } else {
	            System.out.println("Invalid month name entered.");
	        }

	        scanner.close();
	    
	}


}
