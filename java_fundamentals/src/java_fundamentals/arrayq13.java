package java_fundamentals;
import java.util.*;

public class arrayq13 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int o =sc.nextInt();
	    	int[][]matrix =new int[2][2];
	    	for(int i=0;i<2;i++) {
	    		for(int j=0;j<2;j++) {
	    			matrix[i][j]=sc.nextInt();
	    		}
	    	}
	       

	        
	        int[] temp = new int[4];
	        int k = 0;
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                temp[k++] = matrix[i][j];
	            }
	        }

	        
	        for (int i = 0, j = 3; i < j; i++, j--) {
	            int swap = temp[i];
	            temp[i] = temp[j];
	            temp[j] = swap;
	        }

	        k = 0;
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                matrix[i][j] = temp[k++];
	            }
	        }

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	


}
