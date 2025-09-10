package level1;

import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to print its multiplication table (from 6 to 9): ");
        int number = input.nextInt();

        // Define array to store results (4 results: 6,7,8,9)
        int[] multiplicationResult = new int[4];

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
