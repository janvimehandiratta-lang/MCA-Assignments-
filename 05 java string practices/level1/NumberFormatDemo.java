import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the Exception
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a number
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle the Exception
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating NumberFormatException (without handling):");
        try {
            generateException(text); // This will cause exception if input is not numeric
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nDemonstrating NumberFormatException (with handling):");
        handleException(text); // This will handle it gracefully

        sc.close();
    }
}
