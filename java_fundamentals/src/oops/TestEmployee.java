package oops;

public class TestEmployee {
	public static void main(String[] args) {
        Employee emp = new Employee("Manoj", 1000000.50, 2025, "INDIA1109");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: INR " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());
    }

}
