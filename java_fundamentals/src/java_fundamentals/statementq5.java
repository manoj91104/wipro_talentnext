package java_fundamentals;
import java.util.*;

public class statementq5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			char ch =sc.next().charAt(0);
		
		
		if(Character.isDigit(ch)) {
			System.out.print("digit");
			
			
		}
		else if(Character.isLetter(ch)) {
			System.out.print("character");
			
		}
		else {
			System.out.print("Special character");
		}
		}
		sc.close();
	}

}
