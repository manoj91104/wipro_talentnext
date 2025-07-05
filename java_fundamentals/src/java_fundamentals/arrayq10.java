package java_fundamentals;
import java.util.*;
public class arrayq10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int in = 0;
        for (int i = 0; i < n; i++) {
        	if (arr[i] % 2 == 0) {
        		result[in++] = arr[i];
        	}
        }        
        for (int i = 0; i < n; i++) {
        	if (arr[i] % 2 != 0) {
        		result[in++] = arr[i];
        	}
        }
        for (int num : result) {
        	System.out.println(num + " ");
        }
        sc.close();
	}
}

