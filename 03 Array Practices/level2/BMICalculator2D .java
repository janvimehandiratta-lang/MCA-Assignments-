package level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take number of persons
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // Step 2: Create 2D array [rows=persons][columns=3 → weight, height, BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Step 3: Take input for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight (with validation)
            double weight;
            do {
                System.out.print("Weight (kg): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid! Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            // Input height (with validation)
            double height;
            do {
                System.out.print("Height (m): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid! Height must be positive. Try again.");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Step 4: Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    ": Height = " + personData[i][1] + " m, " +
                    "Weight = " + personData[i][0] + " kg, " +
                    "BMI = " + String.format("%.2f", personData[i][2]) +
                    ", Status = " + weightStatus[i]);
        }

        input.close();
    }
}
