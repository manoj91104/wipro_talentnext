package iostream;
import java.io.*;
import java.util.Scanner;

public class operation2 {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the input file name");
	        String inputFile = scanner.nextLine();

	        System.out.println("Enter the output file name");
	        String outputFile = scanner.nextLine();

	        try {
	            FileReader fr = new FileReader(inputFile);
	            FileWriter fw = new FileWriter(outputFile);

	            int c;
	            while ((c = fr.read()) != -1) {
	                fw.write(c);
	            }

	            fr.close();
	            fw.close();

	            System.out.println("File is copied.");
	        } catch (FileNotFoundException e) {
	            System.out.println("Input file not found.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while copying the file.");
	        }
	    
	}


}
