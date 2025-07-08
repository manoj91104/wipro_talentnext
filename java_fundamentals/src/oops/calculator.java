package oops;
import java.util.*;
public class calculator {
	public static int power(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double power(double num1,double num2) {
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		int result1 =power(4,3);
		double result2 =power(5,3);
		System.out.println("num1 to the power of num2 : "+result1);
		System.out.println("num1 to the power of num2 : "+result2);
	}

}
