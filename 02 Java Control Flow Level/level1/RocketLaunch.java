package level1;

import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        // While loop for countdown
        while (counter >= 1) {
            System.out.println("countown" + counter);
            counter--; // decrement by 1
        }
        System.out.println("donee!");

    }
}