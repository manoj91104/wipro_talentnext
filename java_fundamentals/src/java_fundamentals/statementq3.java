package java_fundamentals;
import java.util.*;

public class statementq3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

//        if (input.isEmpty()) {
//            System.out.println("no values");
//        } 
        if(input.isEmpty()){
            String[] names = input.split(",");
            if (names.length == 2 && !names[0].isEmpty() && !names[1].isEmpty()) {
                System.out.println(names[0]);
                System.out.println(names[1]);
            } else {
                System.out.println("no values");
            }
        }

        sc.close();
    }

}
