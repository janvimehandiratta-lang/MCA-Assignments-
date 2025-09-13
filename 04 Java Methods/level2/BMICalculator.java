import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];      // in kg
            double heightCm = data[i][1];    // in cm
            double heightM = heightCm / 100; // convert cm → m
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows, 3 columns

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = getStatus(bmi);

            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weight, height, bmi, status);
        }

        sc.close();
    }
}
