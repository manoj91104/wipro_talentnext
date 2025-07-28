package oops;
import java.util.*;

public class optionalclass3 {
    String name;
    public static void main(String[] args) {
        optionalclass3 m = new optionalclass3();  // m.name is null
        Optional<String> n = Optional.ofNullable(m.name);
        System.out.println(n.orElseThrow(InvalidEmployeeException::new));
    }
}

class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException() {
        super("Employee name is null");
    }
}
