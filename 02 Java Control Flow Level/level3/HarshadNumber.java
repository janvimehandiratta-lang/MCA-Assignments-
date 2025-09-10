package level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum of digits
        int sum = 0;

        // Keep a copy of the original number
        int originalNumber = number;

        // Step 3: Extract digits using while loop
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // get last digit
            sum += digit; // add digit to sum
            originalNumber /= 10; // remove last digit
        }

        // Step 4: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
