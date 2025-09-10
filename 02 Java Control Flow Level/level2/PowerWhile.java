package level2;

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1; // initial result
        int counter = 0; // start counter

        // Loop until counter == power
        while (counter < power) {
            result *= number; // result = result * number
            counter++;
        }

        // Output
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}
