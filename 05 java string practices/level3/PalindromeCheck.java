import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative method using start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        // Reverse the string using charAt()
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text to check palindrome: ");
        String text = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeIterative(text);
        System.out.println("\nPalindrome check using Iterative method: " + result1);

        // Logic 2
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check using Recursive method: " + result2);

        // Logic 3
        boolean result3 = isPalindromeCharArray(text);
        System.out.println("Palindrome check using CharArray method: " + result3);

        sc.close();
    }
}
