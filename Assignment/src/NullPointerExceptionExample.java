// Class to demonstrate handling NullPointerException
public class NullPointerExceptionExample {

    public static void main(String[] args) {
        // Declare a String reference and initialize it to null
        String text = null;

        // Try-Catch block to handle NullPointerException
        try {
            // Attempt to access a method on the null reference
            int length = text.length(); // This line will throw NullPointerException
            System.out.println("The length of the text is: " + length);
        } catch (NullPointerException e) {
            // Handle the exception and provide feedback to the user
            System.err.println("Error: Attempted to access a null reference.");
            System.err.println("Exception Message: " + e.getMessage());
        } finally {
            // Code in the finally block always executes
            System.out.println("Operation completed. Please ensure valid references are used.");
        }
    }
}

