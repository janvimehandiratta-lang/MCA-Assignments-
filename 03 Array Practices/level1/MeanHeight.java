package level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking input for 11 players
        System.out.println("Enter the height (in cm) of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Print result
        System.out.println("\nThe mean height of the football team is " + mean + " cm");

        input.close();
    }
}
