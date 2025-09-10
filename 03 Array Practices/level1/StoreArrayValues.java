package level1;

import java.util.Scanner;

public class StoreArrayValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10]; // Array of max 10 elements
        double total = 0.0; // To store sum
        int index = 0; // Array index

        // Infinite loop to take input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            // Stop if user enters 0 or negative
            if (value <= 0) {
                break;
            }

            // Store in array if index < 10
            if (index < 10) {
                numbers[index] = value;
                index++;
            } else {
                System.out.println("Maximum of 10 numbers reached!");
                break;
            }
        }

        // Calculate sum of stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers and total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of all numbers = " + total);

        input.close();
    }
}
