package level1;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        double total = 0.0;  // to store sum

        System.out.println("Enter numbers to add (enter 0 or a negative number to stop):");

        while (true) { 
            double num = sc.nextDouble();  // take input

            // check exit condition
            if (num <= 0) {
                break; // exit loop if number is 0 or negative
            }
 
            total += num;  // add to total
        }

        // After loop ends
        System.out.println("The total sum is: " + total);

    }
}
