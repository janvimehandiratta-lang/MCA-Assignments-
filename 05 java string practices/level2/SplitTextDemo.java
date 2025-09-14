package level2;

import java.util.Scanner;

public class SplitTextDemo {

    // Method to find the length of a String without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] manualSplit(String text) {
        int n = findLength(text);

        // Step 1: Count spaces to determine number of words
        int wordCount = 1; // at least one word
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

        // Step 3: Extract words using indexes
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

    // Method to compare two arrays of Strings
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Use manual split method
        String[] manualWords = manualSplit(text);

        // Use built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare both results
        boolean isSame = compareArrays(manualWords, builtInWords);

        // Display results
        System.out.println("\nManual Split Result:");
        for (String w : manualWords) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        System.out.println("\nAre both results the same? " + isSame);

        sc.close();
    }
}
