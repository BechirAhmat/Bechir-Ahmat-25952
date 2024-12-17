// Class to demonstrate handling ArithmeticException
public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        // Declare two numbers for division
        int dividend = 100; // Example numerator
        int divisor = 0;    // Example denominator that will cause an exception

        // Try-Catch block to handle ArithmeticException
        try {
            // Perform division
            int result = dividend / divisor;
            System.out.println("Result: " + result); // This line will not execute if exception occurs
        } catch (ArithmeticException e) {
            // Catch and handle division by zero
            System.err.println("Error: Division by zero is not allowed. Please check your inputs.");
            System.err.println("Exception Message: " + e.getMessage());
        } finally {
            // Code in the finally block always executes
            System.out.println("Operation completed. Thanks for using our program!");
        }
    }
}
