package java_fundamentals;
import java.util.*;
public class statementq14 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0;
	        int temp = number;

	        while (temp != 0) {
	            int digit = temp % 10;  // get last digit
	            sum += digit;           // add to sum
	            temp /= 10;             // remove last digit
	        }

	        System.out.println("Sum of digits of " + number + " is: " + sum);

	        scanner.close();
	    }
	


}
