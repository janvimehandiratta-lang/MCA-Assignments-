import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate the Exception
    public static void generateException(String text) {
        // Accessing index beyond length
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle the Exception
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException (without handling):");
        try {
            generateException(text); // This will cause an exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException (with handling):");
        handleException(text); // This will handle it gracefully

        sc.close();
    }
}
