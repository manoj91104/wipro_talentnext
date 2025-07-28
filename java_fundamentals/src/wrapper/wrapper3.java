package wrapper;
import java.util.*;
public class wrapper3 {

	public class BinaryFormatter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer between 1 and 255: ");
	        int number = scanner.nextInt();

	        if (number < 1 || number > 255) {
	            System.out.println("Invalid input. Please enter a number between 1 and 255.");
	        } else {
	            String binaryString = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
	            System.out.println("Binary representation: " + binaryString);
	        }

	        scanner.close();
	    }
	}


}
