package oops;
import java.util.*;
import java.util.Optional;

public class optionalclass2 {
	String name;
	public static void main(String[] args) {
		optionalclass2 na = new optionalclass2();
		Optional<String>n=Optional.ofNullable(na.name);
		System.out.println(n.orElse("India"));
	}

}
