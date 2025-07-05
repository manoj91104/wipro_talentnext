package java_fundamentals;
import java.util.*;
public class arrayq12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		if(n%2==1) {
		int mid1=n/2;
		System.out.println(arr1[mid1]);
		System.out.println(arr2[mid1]);
	}

	}
}
