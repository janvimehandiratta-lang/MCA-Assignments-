package level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100.0;

        // Step b: Calculate BMI using formula
        double bmi = weight / (heightM * heightM);

        // Step c: Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
        System.out.println("\n--- BMI Result ---");
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);

        sc.close();
    }
}
