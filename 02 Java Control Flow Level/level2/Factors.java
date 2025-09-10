package level2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            // loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { // perfectly divisible
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        sc.close();
    }
}
