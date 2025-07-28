package oops;
import java.util.*;
public class stringq10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        String[] parts = input.split(",");
	        String str = parts[0];
	        int n = Integer.parseInt(parts[1]);
	        String lastPart = str.substring(str.length() - n); 
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(lastPart);
	        }
	        System.out.println(result.toString());
	    }

}
