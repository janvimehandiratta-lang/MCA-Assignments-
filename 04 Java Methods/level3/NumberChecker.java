import java.util.Arrays;

public class NumberChecker {

    // Method to count digits in a number
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

    // Method to check if number is Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if number is Armstrong number
    public static boolean isArmstrong(int num, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    // Main method
    public static void main(String[] args) {
        int number = 153; // You can change this value
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digitCount);

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        // Armstrong number check
        System.out.println("Is Armstrong Number? " + isArmstrong(number, digits));

        // Largest & Second Largest
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println(
                "Second Largest Digit: " + (largestTwo[1] == Integer.MIN_VALUE ? "Not Available" : largestTwo[1]));

        // Smallest & Second Smallest
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println(
                "Second Smallest Digit: " + (smallestTwo[1] == Integer.MAX_VALUE ? "Not Available" : smallestTwo[1]));
    }
}
