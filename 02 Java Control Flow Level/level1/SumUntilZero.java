package level1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // to store sum
        double num;           // to store user input

        System.out.println("Enter numbers to add (enter 0 to stop):");

        // First input
        num = sc.nextDouble();

        // Loop until user enters 0
        while (num != 0) {
            total += num;  // add to total
            System.out.print("Enter another number (0 to stop): ");
            num = sc.nextDouble(); // take next input
        }

        // After loop ends
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
