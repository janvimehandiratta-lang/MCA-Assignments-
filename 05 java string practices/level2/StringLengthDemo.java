package level2;

import java.util.Scanner;

public class StringLengthDemo {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Keep accessing characters
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds length
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length using user-defined method
        int manualLength = findLength(text);

        // Find length using built-in length() method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nManual length calculation: " + manualLength);
        System.out.println("Built-in length() method: " + builtInLength);

        sc.close();
    }
}
