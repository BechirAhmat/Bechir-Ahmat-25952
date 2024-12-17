
    public class ClassNotFoundExceptionExample {

        public static void main(String[] args) {
            try {
                // Attempt to load a non-existent class
                System.out.println("Attempting to load a missing class...");
                Class.forName("com.example.MissingClass"); // This class does not exist

            } catch (ClassNotFoundException e) {
                // Handle the ClassNotFoundException
                System.out.println("ClassNotFoundException caught:");
                System.out.println("Error message: " + e.getMessage());

                // Optionally log the exception or take corrective action
            } finally {
                // This block will always execute
                System.out.println("Class loading attempt finished.");
            }
        }
    }


