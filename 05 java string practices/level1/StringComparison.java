import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        // If lengths are different, they can’t be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; // If no mismatch found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using custom method
        boolean resultCharAt = compareStrings(str1, str2);

        // Compare using built-in equals()
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt() method: " + resultCharAt);
        System.out.println("Comparison using equals() method: " + resultEquals);

        // Check if both methods gave same result
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Results are DIFFERENT!");
        }

        sc.close();
    }
}
