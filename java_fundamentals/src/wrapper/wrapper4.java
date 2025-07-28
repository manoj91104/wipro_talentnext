package wrapper;
import java.util.*;
public class wrapper4 {
	class Employee implements Cloneable {
	    int id;
	    String name;
	    double salary;

	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public Employee clone() {
	        try {
	            return (Employee) super.clone(); // Shallow copy
	        } catch (CloneNotSupportedException e) {
	            System.out.println("Cloning not supported.");
	            return null;
	        }
	    }

	    public void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Employee emp1 = new Employee(101, "John", 50000.0);
	        System.out.println("Original Employee:");
	        emp1.display();

	        Employee emp2 = emp1.clone();

	        emp1.name = "David";
	        emp1.salary = 60000.0;

	        System.out.println("\nAfter modifying original employee:");
	        System.out.println("Original Employee:");
	        emp1.display();

	        System.out.println("Cloned Employee:");
	        emp2.display();
	    }
	}


}
