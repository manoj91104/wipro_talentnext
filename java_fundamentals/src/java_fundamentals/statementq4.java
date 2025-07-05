package java_fundamentals;
import java.util.*;
public class statementq4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		char[] characters =new char[n];
		for(int i=0;i<n;i++) {
			characters[i]=sc.next().charAt(0);
		
		}
		sc.close();
		Arrays.sort(characters);
		for(char ch:characters) {
			System.out.print(ch+",");
		}
		
	}

}
