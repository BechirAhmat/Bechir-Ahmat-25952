// Class to demonstrate handling ArrayIndexOutOfBoundsException
public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        // Initialize an array with some elements
        int[] numbers = {10, 20, 30, 40, 50};
        int invalidIndex = 10; // Example of an invalid index that will trigger the exception

        // Try-Catch block to handle ArrayIndexOutOfBoundsException
        try {
            // Attempt to access an invalid index
            int value = numbers[invalidIndex]; // This line will throw ArrayIndexOutOfBoundsException
            System.out.println("Value at index " + invalidIndex + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and provide feedback to the user
            System.err.println("Error: Attempted to access an invalid array index.");
            System.err.println("Exception Message: " + e.getMessage());
            System.err.println("Valid indices are from 0 to " + (numbers.length - 1) + ".");
        } finally {
            // Code in the finally block always executes
            System.out.println("Operation completed. Please ensure valid indices are used.");
        }
    }
}

