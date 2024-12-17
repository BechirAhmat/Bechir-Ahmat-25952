// Class to demonstrate handling IllegalArgumentException
public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {
        // Declare a test value for the method
        int number = -5; // Example of an invalid argument (negative number)

        // Try-Catch block to handle IllegalArgumentException
        try {
            // Call the method with the invalid argument
            checkPositiveNumber(number);
            System.out.println("The number " + number + " is valid.");
        } catch (IllegalArgumentException e) {
            // Handle the exception and provide feedback to the user
            System.err.println("Error: Invalid argument passed to the method.");
            System.err.println("Exception Message: " + e.getMessage());
        } finally {
            // Code in the finally block always executes
            System.out.println("Operation completed. Please pass valid arguments to methods.");
        }
    }

    // Method that only accepts positive numbers
    public static void checkPositiveNumber(int num) {
        if (num <= 0) {
            // Throw an IllegalArgumentException if the argument is invalid
            throw new IllegalArgumentException("Number must be positive. Received: " + num);
        }
    }
}

