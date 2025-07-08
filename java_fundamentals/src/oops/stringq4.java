package oops;
import java.util.*;
public class stringq4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		int m=s.length();
		String l="";
		if(m%2==0) {
			l=s.substring(0,m/2);
			System.out.println(l);
		}
		else {
			System.out.println("ODD");
		}
	}

}
