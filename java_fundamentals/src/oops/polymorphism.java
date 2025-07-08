package oops;
class shape{
	public void draw() {
		System.out.println("Drawing shape");
	}
	public void erase() {
		System.out.println("Erasing shape");
	}
}
class Circle extends shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
	public void erase() {
		System.out.println("Erasing circle");
	}
}
class Triangle extends shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends shape{
	public void draw() {
		System.out.println("Drawing square");
	}
	public void erase() {
		System.out.println("Erasing square");
	}
}

public class polymorphism {
	public static void main(String[] args) {
		shape c =new Circle();
		shape t =new Triangle();
		shape s =new Square();
		System.out.println("Circle: ");
		c.draw();
		c.erase();
		System.out.println("Triangle: ");
		t.draw();
		t.erase();
		System.out.println("Square: ");
		s.draw();
		s.erase();
	}

}
