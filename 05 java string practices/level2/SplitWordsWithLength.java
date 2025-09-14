package level2;

import java.util.Scanner;

public class SplitWordsWithLength {

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

        // Step 2: Store space indexes
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
            result[i][1] = String.valueOf(findLength(words[i])); // store length as String
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Step 1: Split into words manually
        String[] words = manualSplit(text);

        // Step 2: Get 2D array of words and lengths
        String[][] table = wordsWithLength(words);

        // Step 3: Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]); // convert back to int
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
