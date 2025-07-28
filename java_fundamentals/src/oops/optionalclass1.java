package oops;
import java.util.*;


public class optionalclass1 {
	public static void main(String[] args) {
		
	
	String names[] =new String[5];
	
	
	Optional<String> n =Optional.ofNullable(names[0]);
	if(n.isPresent()) {
		System.out.println(n.get());
	}
	else {
		System.out.println("");
	}
	}
}
