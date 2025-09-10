package level3;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true; // Assume number is prime

        // Prime check only for numbers greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // If divisible, not prime
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}
