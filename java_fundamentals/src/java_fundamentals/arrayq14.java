package java_fundamentals;
import java.util.*;
public class arrayq14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int o =sc.nextInt();
		int[][] matrix=new int[3][3];
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 
					matrix[i][j]=sc.nextInt();
				
			}
		}
		int max=matrix[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matrix[i][j]>max) {
					max=matrix[i][j];
					
				}
			}
		}
		System.out.println(max);
		
	}

}
