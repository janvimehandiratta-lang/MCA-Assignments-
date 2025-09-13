import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return them in an array
    public static int[] findFactors(int number) {
        // Count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] arr) {
        long product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static int findSumOfSquares(int[] arr) {
        int sumSq = 0;
        for (int num : arr) {
            sumSq += Math.pow(num, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Find factors
        int[] factors = findFactors(number);

        // Step 3: Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Step 4: Other calculations
        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        sc.close();
    }
}
