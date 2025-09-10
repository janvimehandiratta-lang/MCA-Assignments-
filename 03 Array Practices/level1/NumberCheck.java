package level1;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of 5 elements
        int[] numbers = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nResults:");
        // Loop through the array to check conditions
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number " + num + " is Zero.");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last element:");
        if (first == last) {
            System.out.println("The first element " + first + " is equal to the last element " + last + ".");
        } else if (first > last) {
            System.out.println("The first element " + first + " is greater than the last element " + last + ".");
        } else {
            System.out.println("The first element " + first + " is less than the last element " + last + ".");
        }

        input.close();
    }
}
