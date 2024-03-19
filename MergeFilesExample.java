import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class MergeFilesExample {
    public static void main(String[] args) {
        try {
            // Declare input files
            File inputFile1 = new File("input1.txt");
            File inputFile2 = new File("input2.txt");
            
            // Declare output file
            File outputFile = new File("merged_output.txt");
            
            // Open input files for reading
            BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
            
            // Open output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            
            // Merge files
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            // Close all resources
            reader1.close();
            reader2.close();
            writer.close();
            
            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
