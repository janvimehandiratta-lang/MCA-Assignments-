package level1;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 0) { // check for non-negative integer
            long factorial = 1; // to store result
            int i = 1;

            // while loop to calculate factorial
            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }

        sc.close();
    }
}
