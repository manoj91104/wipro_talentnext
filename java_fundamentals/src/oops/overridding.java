package oops;
class fruit{
	String name;
	String taste;
	String size;
	
	fruit(String name,String taste, String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println(name +" tastes "+taste);
	}
}
class Apple extends fruit{
	Apple(){
		super("Apple","sweet","medium");
	}
	public void eat() {
		System.out.println(name +" is "+taste+" size is "+size);
	}
}
class Orange extends fruit{
	Orange(){
		super("Orange","sour","big");
	}
	public void eat() {
		System.out.println(name +" is "+taste+" size is "+size);
	}
	
}


public class overridding {
	public static void main(String[] args) {
		Apple apple=new Apple();
		Orange orange= new Orange();
		
		apple.eat();
		orange.eat();
	}

}
