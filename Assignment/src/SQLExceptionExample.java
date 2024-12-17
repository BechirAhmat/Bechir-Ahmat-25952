
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class SQLExceptionExample {

        public static void main(String[] args) {
            // JDBC URL, username, and password for a non-existent database
            String jdbcUrl = "jdbc:mysql://localhost:3306/nonexistentdb"; // Database does not exist
            String username = "root";
            String password = "password";

            Connection connection = null;

            try {
                // Attempt to establish a connection to the database
                System.out.println("Connecting to the database...");
                connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Create a statement object and execute an invalid SQL query
                Statement statement = connection.createStatement();
                String invalidQuery = "SELECT * FROM nonexistenttable"; // Table does not exist
                statement.executeQuery(invalidQuery);

            } catch (SQLException e) {
                // Handle SQLException
                System.out.println("A database error occurred:");
                System.out.println("Error message: " + e.getMessage());
                System.out.println("SQL state: " + e.getSQLState());
                System.out.println("Error code: " + e.getErrorCode());

            } finally {
                // Close the connection if it was opened
                if (connection != null) {
                    try {
                        connection.close();
                        System.out.println("Database connection closed.");
                    } catch (SQLException e) {
                        System.out.println("Error closing the database connection: " + e.getMessage());
                    }
                }
            }
        }
    }


