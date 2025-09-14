import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // frequency array for all ASCII characters
        int n = text.length();

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (freq[(int) ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0';
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
