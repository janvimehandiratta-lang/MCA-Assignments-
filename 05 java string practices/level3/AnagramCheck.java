import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256]; // Frequency array for first text
        int[] freq2 = new int[256]; // Frequency array for second text

        // Count frequency of each character in text1
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            freq1[(int) ch]++;
        }

        // Count frequency of each character in text2
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            freq2[(int) ch]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Check for anagrams
        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("\nThe texts are anagrams.");
        } else {
            System.out.println("\nThe texts are not anagrams.");
        }

        sc.close();
    }
}
