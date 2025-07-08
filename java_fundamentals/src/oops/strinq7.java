package oops;
import java.util.*;
public class strinq7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String S = sc.nextLine();
		char ch =sc.next().charAt(0);
		String o =S.replace(String.valueOf(ch),"");
		System.out.println(o);
	}

}
