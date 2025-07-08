package oops;
import java.util.*;
public class box {
	private double width;
	private double height;
	private double breadth;
	public box(double width, double height, double breadth) {
		this.width=width;
		this.height=height;
		this.breadth=breadth;
		
	}
	public double volume() {
		return width*height*breadth;
	}
	public static void main(String[] args) {
		box my =new box(3.4,4.5,2.3);
		System.out.println(my.volume());
	}

}
