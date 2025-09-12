import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // add each number
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Call method
        int sum = calculateSum(n);

        // Display result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
