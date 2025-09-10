package level2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            int greatestFactor = 1;
            int counter = number - 1;

            // while loop
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // exit after finding the largest factor
                }
                counter--;
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }

        sc.close();
    }
}
