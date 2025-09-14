package level2;

import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] manualSplit(String text) {
        int n = findLength(text);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // Step 3: Extract words
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[wordIndex++] = word.toString();
            start = end + 1;
        }

        // Last word
        StringBuilder lastWord = new StringBuilder();
        for (int j = start; j < n; j++) {
            lastWord.append(text.charAt(j));
        }
        words[wordIndex] = lastWord.toString();

        return words;
    }

    // Method to return 2D array [word, length]
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            int minLength = Integer.parseInt(table[minIndex][1]);
            int maxLength = Integer.parseInt(table[maxIndex][1]);

            if (length < minLength) {
                minIndex = i;
            }
            if (length > maxLength) {
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex }; // return indexes
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Step 1: Split manually
        String[] words = manualSplit(text);

        // Step 2: Get words with lengths
        String[][] table = wordsWithLength(words);

        // Step 3: Find shortest and longest
        int[] result = findShortestAndLongest(table);

        // Step 4: Display all words with lengths
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

        // Step 5: Display shortest and longest
        System.out.println("\nShortest word: " + table[result[0]][0] + " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] + " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
