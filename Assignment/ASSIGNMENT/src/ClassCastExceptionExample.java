// Class to demonstrate handling ClassCastException
public class ClassCastExceptionExample {

    public static void main(String[] args) {
        // Declare an Object and assign a String value to it
        Object obj = "This is a String";

        // Try-Catch block to handle ClassCastException
        try {
            // Attempt to cast the Object to an incompatible type (Integer)
            Integer number = (Integer) obj; // This line will throw ClassCastException
            System.out.println("The number is: " + number);
        } catch (ClassCastException e) {
            // Handle the exception and provide feedback to the user
            System.err.println("Error: Invalid type casting detected.");
            System.err.println("Exception Message: " + e.getMessage());
            System.err.println("Ensure the object is of the expected type before casting.");
        } finally {
            // Code in the finally block always executes
            System.out.println("Operation completed. Type safety is essential in Java.");
        }
    }
}
