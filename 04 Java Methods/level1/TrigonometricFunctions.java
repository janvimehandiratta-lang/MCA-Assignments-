import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trig functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results in array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sine(%.2f°) = %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, results[2]);

        sc.close();
    }
}
