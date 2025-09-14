import java.util.Scanner;

public class LowerCaseComparison {

    // Method to manually convert uppercase letters to lowercase
    public static String manualToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference (32)
                result += (char) (ch + 32);
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
        String manualLower = manualToLowerCase(text);

        // Convert using built-in method
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean result = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual Lowercase Conversion: " + manualLower);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
