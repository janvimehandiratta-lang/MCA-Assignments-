import java.util.Scanner;

public class FrequencyNestedLoops {

    // Method to find frequency using nested loops
    public static String[][] frequencyOfCharacters(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        // Initialize frequencies
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // Nested loop to count frequency
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0')
                continue; // skip already counted duplicates

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate as counted
                }
            }
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0')
                uniqueCount++;
        }

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index][0] = Character.toString(chars[i]);
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
        String[][] frequencyTable = frequencyOfCharacters(text);

        // Display results
        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + "\t\t" + frequencyTable[i][1]);
        }

        sc.close();
    }
}
