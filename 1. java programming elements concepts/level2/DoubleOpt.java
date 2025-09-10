package level2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a, b, and c as double
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Perform double operations
        double op1 = a + b * c; // Multiplication first, then addition
        double op2 = a * b + c; // Multiplication first, then addition
        double op3 = c + a / b; // Division first, then addition
        double op4 = a % b + c; // Modulus first, then addition

        // Display the results
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);

        input.close();
    }
}
