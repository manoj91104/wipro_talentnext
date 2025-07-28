package iostream;


	import java.io.*;
	import java.util.Date;

	public class SerializeDeserializeDemo {
	    public static void main(String[] args) {
	        Employee emp = new Employee("Manoj", new Date(95, 4, 18), "IT", "Developer", 75000.0);

	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
	            oos.writeObject(emp);
	            System.out.println("Employee object serialized to file 'data'");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
	            Employee readEmp = (Employee) ois.readObject();

	            System.out.println("\nDeserialized Employee details:");
	            System.out.println("Name: " + readEmp.getName());
	            System.out.println("DOB: " + readEmp.getDateOfBirth());
	            System.out.println("Department: " + readEmp.getDepartment());
	            System.out.println("Designation: " + readEmp.getDesignation());
	            System.out.println("Salary: " + readEmp.getSalary());

	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}



