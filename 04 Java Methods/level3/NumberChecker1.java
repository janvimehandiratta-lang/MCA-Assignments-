import java.util.Arrays;

public class NumberChecker1 {

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

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of each digit (0-9)
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit, frequency]

        // Initialize digits
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    // Main method
    public static void main(String[] args) {
        int number = 1729; // You can change the number here
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));

        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);

        System.out.println("Sum of Digits: " + sumDigits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        // Frequency
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " → " + freq[i][1] + " times");
            }
        }
    }
}
