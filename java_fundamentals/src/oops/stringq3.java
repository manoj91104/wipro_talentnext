package oops;
import java.util.*;
public class stringq3 {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  String n =sc.nextLine();
    	  int m=n.length();
    	  String k=n.length()<2 ? n : n.substring(0,2);
    	  String l="";
    	  for(int i=0;i<m;i++) {
    		  l+=k;
    	  }
    	  System.out.println(l);
    	  
	
   }
}
