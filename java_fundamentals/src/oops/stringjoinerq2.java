package oops;
import java.util.*;
public class stringjoinerq2 {
	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner(",","(",")");
		s1.add("Manoj");
		s1.add("manasa");
		s1.add("manu");
		StringJoiner s2=new StringJoiner("-","{","}");
		s2.add("1");
		s2.add("2");
		System.out.println("s1 : "+ s1);
		System.out.println("s2 : "+ s2);
		s1.merge(s2);
		System.out.println("now s1 : "+s1);
	}

}
