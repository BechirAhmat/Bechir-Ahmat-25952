/**
 * Summary:
 * This class demonstrates handling an IOException in Java.
 * The IOException is simulated by attempting to read a non-existent file.
 * Exception handling is implemented using try-catch blocks with comments explaining each step.
 */

import java.io.*;

public class IOExceptionHandler {

    // Method to simulate and handle an IOException
    public void readFile() {
        BufferedReader reader = null; // Initialize the reader to null for proper cleanup

        try {
            // Simulate IOException: Attempt to read from a non-existent file
            File file = new File("nonexistent_file.txt");
            reader = new BufferedReader(new FileReader(file));

            // Try to read the first line from the file
            String line = reader.readLine();
            System.out.println("File content: " + line);

        } catch (IOException e) {
            // Handle IOException when the file cannot be found or accessed
            System.out.println("IOException caught: " + e.getMessage());
            System.out.println("Explanation: An error occurred while trying to access or read the file.");

        } finally {
            // Ensure the reader is closed to release resources
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File reader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader: " + e.getMessage());
            }
        }
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Create an instance of the class and call the method
        IOExceptionHandler handler = new IOExceptionHandler();
        handler.readFile();
    }
}