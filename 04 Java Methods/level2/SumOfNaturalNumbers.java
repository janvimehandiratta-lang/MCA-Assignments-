import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method
    static int recursiveSum(int n) {
        if (n == 1) {
            return 1; // base case
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    // Formula method
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if input is natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (n > 0).");
            return;
        }

        // Compute using recursion
        int sumRecursive = recursiveSum(n);

        // Compute using formula
        int sumFormula = formulaSum(n);

        // Display results
        System.out.println("Sum of first " + n + " natural numbers (Recursion): " + sumRecursive);
        System.out.println("Sum of first " + n + " natural numbers (Formula): " + sumFormula);

        // Compare results
        if (sumRecursive == sumFormula) {
            System.out.println("✅ Both results match. Computation is correct!");
        } else {
            System.out.println(" Results do not match. Something went wrong.");
        }
    }
}
