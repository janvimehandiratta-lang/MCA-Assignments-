import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency array
        int n = text.length();

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }

        // Count number of unique characters for 2D array size
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                uniqueCount++;
        }

        // Create 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get frequency table
        String[][] frequencyTable = findFrequency(text);

        // Display results
        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + "\t\t" + frequencyTable[i][1]);
        }

        sc.close();
    }
}
