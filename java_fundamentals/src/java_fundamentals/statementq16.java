package java_fundamentals;
import java.util.*;
public class statementq16 {
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        int number=sc.nextInt();
	        int reverse = 0;

	        while (number != 0) {
	            reverse = reverse * 10 + number % 10;
	            number = number / 10;
	        }

	        System.out.println("Reversed number: " + reverse);
	    }
	


}
