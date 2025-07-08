package oops;
import java.util.*;
public class stringq2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input =sc.nextLine();
		String[] parts =input.split(",");
		String str1 =parts[0].toLowerCase();
		String str2=parts[1].toLowerCase();
		if(str1.charAt(str1.length()-1)==str2.charAt(0)) {
			str2=str2.substring(1);
		}
		System.out.println(str1+str2);
	}

}
