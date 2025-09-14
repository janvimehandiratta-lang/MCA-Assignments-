package level2;

import java.util.Scanner;

public class ManualTrimDemo {

    // Method to find start and end indexes without leading/trailing spaces
    public static int[] findTrimIndexes(String text) {
        int n = text.length();
        int start = 0, end = n - 1;

        // Find first non-space character
        while (start < n && text.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end }; // return indexes
    }

    // Method to create substring manually using charAt()
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
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

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input with spaces
        System.out.print("Enter a string with leading/trailing spaces: ");
        String text = sc.nextLine();

        // Step 1: Find trim indexes
        int[] indexes = findTrimIndexes(text);

        // Step 2: Get manually trimmed text
        String manualTrimmed = "";
        if (indexes[0] <= indexes[1]) { // only if valid (not all spaces)
            manualTrimmed = manualSubstring(text, indexes[0], indexes[1]);
        }

        // Step 3: Get built-in trim() result
        String builtinTrimmed = text.trim();

        // Step 4: Compare
        boolean isSame = compareStrings(manualTrimmed, builtinTrimmed);

        // Display results
        System.out.println("\nManual Trimmed: \"" + manualTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtinTrimmed + "\"");
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}
