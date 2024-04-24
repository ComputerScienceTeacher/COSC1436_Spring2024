import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdatePrimaryFileExample {
    public static void main(String[] args) {
        try {
            // Open primary file for writing
            File primaryFile = new File("primary_data.txt");
            FileWriter writer = new FileWriter(primaryFile, true); // Append mode
            
            // Sample transaction record
            String transactionRecord = "New data to be appended";
            
            // Append transaction record to primary file
            writer.write(transactionRecord);
            writer.write(System.lineSeparator()); // Add newline
            
            // Close writer
            writer.close();
            
            System.out.println("Transaction record appended to primary file.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}