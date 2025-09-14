import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate the Exception
    public static void generateException(String text) {
        // Start index > End index (invalid) → causes IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle the Exception
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating IllegalArgumentException (without handling):");
        try {
            generateException(text); // This will cause an exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nDemonstrating IllegalArgumentException (with handling):");
        handleException(text); // This will handle it gracefully

        sc.close();
    }
}
