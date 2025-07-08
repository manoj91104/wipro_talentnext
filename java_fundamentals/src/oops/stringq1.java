package oops;
import java.util.*;
public class stringq1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 =sc.nextLine();
		
		input1=input1.toLowerCase();
		String reverse ="";
		
		for(int i=input1.length()-1;i>=0;i--) {
			reverse+=input1.charAt(i);
		}
		if(input1.equals(reverse)) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("Not  a  palidrome");
		}
		
	}

}
