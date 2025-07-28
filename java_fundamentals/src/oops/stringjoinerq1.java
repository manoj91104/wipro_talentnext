package oops;
import java.util.*;
public class stringjoinerq1 {
	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner(",","{","}");
		s1.add("manoj");
		s1.add("manasa");
		s1.add("manvesh");
		System.out.println(s1);
	}

}
