import java.util.Scanner;

public class CharArrayComparison {

    // Method to convert string to char array manually using charAt()
    public static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Utility method to print char array
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Convert using manual method
        char[] manualArr = manualToCharArray(text);

        // Convert using built-in toCharArray()
        char[] builtInArr = text.toCharArray();

        // Compare results
        boolean result = compareCharArrays(manualArr, builtInArr);

        // Display results
        System.out.println("\nManual char array: ");
        printCharArray(manualArr);

        System.out.println("Built-in toCharArray(): ");
        printCharArray(builtInArr);

        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
