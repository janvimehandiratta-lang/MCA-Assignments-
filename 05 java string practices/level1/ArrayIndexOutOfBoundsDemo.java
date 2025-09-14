import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the Exception
    public static void generateException(String[] names) {
        // Trying to access index equal to array length (invalid index)
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method to handle the Exception
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException (without handling):");
        try {
            generateException(names); // This will throw the exception
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException (with handling):");
        handleException(names); // This will handle it gracefully

        sc.close();
    }
}
