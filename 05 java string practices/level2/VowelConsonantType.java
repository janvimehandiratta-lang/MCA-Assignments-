package level2;

import java.util.Scanner;

public class VowelConsonantType {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase manually using ASCII difference
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check for vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check for consonants
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find character types and store them in a 2D array
    public static String[][] analyzeCharacters(String text) {
        int n = text.length();
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); // store character
            result[i][1] = checkCharType(ch); // store type
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Analyze characters
        String[][] result = analyzeCharacters(input);

        // Step 2: Display result in tabular format
        displayResult(result);

        sc.close();
    }
}
