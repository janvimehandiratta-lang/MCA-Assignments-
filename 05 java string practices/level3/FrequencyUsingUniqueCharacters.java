import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {

    // Method to find length of string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index is out of range
                count++;
            }
        } catch (Exception e) {
            // stop when out of range
        }
        return count;
    }

    // Method to find unique characters in the string
    public static char[] uniqueCharacters(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if character already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Copy unique characters to new array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] frequencyUsingUnique(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqTable = new String[uniqueChars.length][2];

        // Count frequency of each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            for (int j = 0; j < getLength(text); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            freqTable[i][0] = Character.toString(ch);
            freqTable[i][1] = Integer.toString(count);
        }

        return freqTable;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get frequency table using unique characters
        String[][] frequencyTable = frequencyUsingUnique(text);

        // Display results
        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + "\t\t" + frequencyTable[i][1]);
        }

        sc.close();
    }
}
