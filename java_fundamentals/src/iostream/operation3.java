package iostream;
import java.io.*;
import java.util.*;
public class operation3 {


	
	    public static void main(String[] args) {
	        if (args.length != 2) {
	            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
	            return;
	        }

	        String inputFile = args[0];
	        String outputFile = args[1];

	        Map<String, Integer> wordCount = new TreeMap<>(); // TreeMap to sort alphabetically

	        try {
	            // Read from input file
	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+"); // Split by whitespace
	                for (String word : words) {
	                    if (!word.isEmpty()) {
	                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	            reader.close();

	            // Write to output file
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
	            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	                writer.write(entry.getKey() + " : " + entry.getValue());
	                writer.newLine();
	            }
	            writer.close();

	            System.out.println("Word count written to " + outputFile);

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    
	}


}
