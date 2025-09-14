import java.util.Scanner;

public class UniqueCharacters {

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

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
        char[] temp = new char[len]; // temporary storage
        int uniqueCount = 0;

        // outer loop for each character
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if already appeared before
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

        // Copy only unique characters into new array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get unique characters
        char[] result = findUniqueCharacters(text);

        // Display result
        System.out.print("Unique characters: ");
        for (char c : result) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
