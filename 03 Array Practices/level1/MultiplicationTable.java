package level1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        // Define an array of size 10 to store results
        int[] table = new int[10];

        // Calculate multiplication table and store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Print the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
