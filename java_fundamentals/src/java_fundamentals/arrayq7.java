package java_fundamentals;
import java.util.*;

public class arrayq7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // adds only unique values
        }

        System.out.println("After removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
        sc.close();
	}
}


