package level2;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take number of persons
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        // Step 2: Create arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step 3: Take input for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            weight[i] = input.nextDouble();
            System.out.print("Height (m): ");
            height[i] = input.nextDouble();

            // Step 4: Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Step 5: Determine status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + height[i] + " m, Weight = "
                    + weight[i] + " kg, BMI = " + String.format("%.2f", bmi[i])
                    + ", Status = " + status[i]);
        }

        input.close();
    }
}
