package oops;
import java.util.*;
 class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}
 class Bird extends Animal{
	public void eat() {
		System.out.println("Bird is eating");
	}
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
	public void fly() {
		System.out.println("Bird is flying");
	}
}
public class inheritance{
	

		public static void main(String[] args) {
			Animal a = new Animal();
			a.eat();
			a.sleep();
			System.out.println();
			
			Bird b= new Bird();
			b.eat();
			b.sleep();
			b.fly();
			System.out.println();
		
	}
}
