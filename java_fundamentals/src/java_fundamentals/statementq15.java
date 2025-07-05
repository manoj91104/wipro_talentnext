package java_fundamentals;
import java.util.*;
public class statementq15 {
	
	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	        int rows =sc.nextInt();
	        int count = 1;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	                count++;
	            }
	            System.out.println(); // Move to next line after each row
	        }
	        sc.close();
	    }
	


}
