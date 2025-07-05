package java_fundamentals;

import java.util.*;

public class arrayq11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean valid=true;
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        	if(arr[i]!=1 && arr[i]!=4) {
        		valid=false;
        	}
        }
        
        if(valid) {
        	System.out.println("True");
        	
        }
        else {
        	System.out.println("False");
        }
        
}
}
