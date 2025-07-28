package iostream;
import java.io.*;
import java.util.Scanner;
public class operation1 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get file name and character to be counted
	        System.out.println("Enter the file name");
	        String fileName = scanner.nextLine();

	        System.out.println("Enter the character to be counted");
	        char ch = scanner.nextLine().toLowerCase().charAt(0); // Convert to lowercase

	        int count = 0;

	        try {
	            FileReader fr = new FileReader(fileName);
	            int c;

	            while ((c = fr.read()) != -1) {
	                char currentChar = Character.toLowerCase((char) c);
	                if (currentChar == ch) {
	                    count++;
	                }
	            }

	            fr.close();

	            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + fileName);
	        } catch (IOException e) {
	            System.out.println("Error reading file.");
	        }

	        scanner.close();
	    
	}


}
