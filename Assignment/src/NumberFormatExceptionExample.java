// Class to demonstrate handling NumberFormatException
public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        // Declare a test string for conversion
        String input = "99A"; // Example of an invalid number format

        // Try-Catch block to handle NumberFormatException
        try {
            // Attempt to parse the string into an integer
            int number = Integer.parseInt(input); // This will throw NumberFormatException
            System.out.println("The parsed number is: " + number);
        } catch (NumberFormatException e) {
            // Handle the exception and provide feedback to the user
            System.err.println("Error: Unable to convert the input string to a valid number.");
            System.err.println("Details: " + e.getMessage());
        } finally {
            // Code in the finally block always executes
            System.out.println("Operation completed. Please ensure the input is a valid number format.");
        }
    }
}
