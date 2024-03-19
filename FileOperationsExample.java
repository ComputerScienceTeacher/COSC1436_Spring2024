import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileOperationsExample {
    public static void main(String[] args) {
        try {
            // Declaring a File Identifier
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");
            
            // Opening a File in Java
            FileReader reader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            // Reading Data from a File and Processing It
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line of data
                // Example: Print each line
                System.out.println(line);
                
                // Writing Data to a File
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Writing new line character
            }
            
            // Closing a File Properly
            bufferedReader.close();
            bufferedWriter.close();
            
            System.out.println("File operations completed successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
