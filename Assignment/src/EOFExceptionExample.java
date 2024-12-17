
    import java.io.*;

    public class EOFExceptionExample {

        public static void main(String[] args) {
            // Create a file with limited content
            String filePath = "example.dat"; // The file we'll use to demonstrate EOFException

            // Step 1: Write a small amount of data to the file
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
                dos.writeInt(42); // Write an integer to the file
                System.out.println("Data written to the file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }

            // Step 2: Attempt to read more data than exists in the file
            try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
                System.out.println("Reading data from the file...");
                int number = dis.readInt(); // Read the first (and only) integer
                System.out.println("Read number: " + number);

                // Intentionally attempt to read beyond the end of the file
                int extraNumber = dis.readInt(); // This will trigger EOFException
                System.out.println("Read another number: " + extraNumber);
            } catch (EOFException e) {
                // Handle the EOFException when the end of the file is reached unexpectedly
                System.out.println("Reached the end of the file unexpectedly: " + e.getMessage());
            } catch (IOException e) {
                // Handle other I/O exceptions
                System.out.println("An I/O error occurred: " + e.getMessage());
            } finally {
                // Cleanup or logging tasks can be performed here
                System.out.println("File reading attempt finished.");
            }
        }
    }


