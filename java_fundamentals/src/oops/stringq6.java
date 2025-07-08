package oops;
import java.util.*;
public class stringq6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String S1 =sc.nextLine();
		String S2 =sc.nextLine();
		int l1=S1.length();
		int l2=S2.length();
		if(l2>l1) {
			System.out.println(S1+S2+S1);
			
		}else{
			System.out.println(S2+S1+S2);
			
		}
	}

}
