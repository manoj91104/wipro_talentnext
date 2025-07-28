package abs_pac_exchand;

public class exce2 {
	public class MathOperation {
	    public static void main(String[] args) {
	        try {
	            if (args.length != 5) {
	                throw new IllegalArgumentException("Exactly 5 integers are required.");
	            }

	            int[] numbers = new int[5];
	            int sum = 0;
	            double average;

	            for (int i = 0; i < 5; i++) {
	                numbers[i] = Integer.parseInt(args[i]); // May throw NumberFormatException
	                sum += numbers[i];
	            }

	            average = sum / 5.0; // May throw ArithmeticException if division logic is wrong (e.g., by zero)

	            System.out.println("Sum: " + sum);
	            System.out.println("Average: " + average);
	        } 
	        catch (NumberFormatException e) {
	            System.out.println("NumberFormatException: Please enter only integer values.");
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException: " + e.getMessage());
	        } 
	        catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e);
	        }
	    }
	}


}
