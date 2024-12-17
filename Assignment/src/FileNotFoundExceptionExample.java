import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) {
        // Define the path to the file that doesn't exist
        String filePath = "nonexistentfile.txt"; // This file does not exist in the directory

        try {
            // Attempt to open the non-existent file for reading
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(new FileReader(file)); // This line will throw a FileNotFoundException

            // Read the content of the file (this line will not be executed if the file is not found)
            while (fileScanner.hasNextLine()) {
                String content = fileScanner.nextLine();
                System.out.println(content);
            }
            fileScanner.close();
        } catch (FileNotFoundException ex) {
            // This block handles the specific FileNotFoundException
            System.out.println("File not found:");
            System.out.println(ex.getMessage()); // Display the error message specific to the file not being found

            // Optionally log the exception details or rethrow the exception if needed
        } catch (IOException ex) {
            // This block handles general IOExceptions (catching them if any other I/O error occurs)
            System.out.println("An I/O error occurred:");
            System.out.println(ex.getMessage());
        } finally {
            // This block will always execute, regardless of whether an exception occurred or not
            System.out.println("File reading attempt finished.");
        }
    }
}
