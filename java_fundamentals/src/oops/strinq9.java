package oops;
import java.util.*
;
public class strinq9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();
	        String[] parts = input.split(",");

	        String a = parts[0];
	        String b = parts[1];

	        StringBuilder result = new StringBuilder();

	        int length = Math.max(a.length(), b.length());

	        for (int i = 0; i < length; i++) {
	            if (i < a.length()) result.append(a.charAt(i));
	            if (i < b.length()) result.append(b.charAt(i));
	        }

	        System.out.println("Output: " + result.toString());
	    }
	}


