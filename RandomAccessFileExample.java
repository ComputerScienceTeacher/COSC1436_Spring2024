import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            // Open a random access file in read-write mode
            RandomAccessFile file = new RandomAccessFile("data.bin", "rw");
            
            // Write data to file at specific position
            file.seek(0); // Move to start of file
            file.writeInt(123); // Write integer
            file.writeDouble(3.14); // Write double
            
            // Read data from file at specific position
            file.seek(0); // Move to start of file
            int intValue = file.readInt(); // Read integer
            double doubleValue = file.readDouble(); // Read double
            
            // Display read data
            System.out.println("Integer value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            
            // Close file
            file.close();
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}