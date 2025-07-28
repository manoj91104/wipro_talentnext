package abs_pac_exchand;
import java.util.*;
public class exce3 {
	

	class NegativeValueException extends Exception {
	    public NegativeValueException(String message) {
	        super(message);
	    }
	}

	class OutOfRangeException extends Exception {
	    public OutOfRangeException(String message) {
	        super(message);
	    }
	}

	public class StudentMarks {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int numStudents = 2;
	        int numSubjects = 3;

	        for (int i = 1; i <= numStudents; i++) {
	            try {
	                System.out.println("Enter the name of student " + i + ": ");
	                String name = sc.nextLine();

	                int[] marks = new int[numSubjects];
	                int total = 0;

	                for (int j = 0; j < numSubjects; j++) {
	                    System.out.println("Enter marks for subject " + (j + 1) + ": ");
	                    String input = sc.nextLine();

	                    
	                    int mark = Integer.parseInt(input);

	                    if (mark < 0) {
	                        throw new NegativeValueException("Negative marks are not allowed.");
	                    }
	                    if (mark > 100) {
	                        throw new OutOfRangeException("Marks should be in the range 0 to 100.");
	                    }

	                    marks[j] = mark;
	                    total += mark;
	                }

	                double average = total / (double) numSubjects;
	                System.out.println("Average marks for " + name + " = " + average);
	            } catch (NumberFormatException e) {
	                System.out.println("NumberFormatException: Please enter a valid integer.");
	                i--; 
	            } catch (NegativeValueException | OutOfRangeException e) {
	                System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
	                i--; 
	            }
	        }

	        sc.close();
	    }
	}


}
