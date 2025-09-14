package level2;

import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10; // generate random age between 10 and 91
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // negative age = invalid
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Generate random ages
        int[] ages = generateAges(n);

        // Step 3: Check voting eligibility
        String[][] eligibility = checkEligibility(ages);

        // Step 4: Display results
        displayTable(eligibility);

        sc.close();
    }
}
