import java.util.Scanner;

public class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // division
        int remainder = number % divisor; // modulus
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        sc.close();
    }
}
