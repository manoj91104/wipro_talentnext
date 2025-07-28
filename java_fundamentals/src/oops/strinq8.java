package oops;
import java.util.*;
public class strinq8 {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        System.out.print("Enter character to remove with neighbors: ");
	        char target = sc.next().charAt(0);

	        boolean[] remove = new boolean[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == target) {
	                remove[i] = true;
	                if (i > 0) remove[i - 1] = true;
	                if (i < str.length() - 1) remove[i + 1] = true;
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            if (!remove[i]) {
	                result.append(str.charAt(i));
	            }
	        }

	        System.out.println("Result: " + result.toString());
	    }
	}


