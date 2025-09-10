package level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            int i = 1; // counter

            // while loop to find factors
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        sc.close();
    }
}
