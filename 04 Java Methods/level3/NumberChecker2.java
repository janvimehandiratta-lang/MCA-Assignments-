import java.util.Arrays;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Method to check Palindrome number
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true; // Duck number found
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        int number = 1221; // test number
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));

        // Palindrome check
        System.out.println("Is Palindrome? " + isPalindrome(digits));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        // Reverse array
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        // Compare original & reversed
        System.out.println("Original and Reversed are Equal? " + compareArrays(digits, reversed));
    }
}
