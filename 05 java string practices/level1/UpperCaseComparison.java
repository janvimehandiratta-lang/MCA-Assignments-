import java.util.Scanner;

public class UpperCaseComparison {

    // Method to manually convert lowercase letters to uppercase
    public static String manualToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference (32)
                result += (char) (ch - 32);
            } else {
                result += ch; // Keep other characters unchanged
            }
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Convert manually
        String manualUpper = manualToUpperCase(text);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean result = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase Conversion: " + manualUpper);
        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
