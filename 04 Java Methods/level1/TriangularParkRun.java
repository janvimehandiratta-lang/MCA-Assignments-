import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate rounds needed
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter; // total distance / perimeter
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for sides of the triangle
        System.out.print("Enter side 1 of the park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the park (in meters): ");
        double side3 = sc.nextDouble();

        // Call method to calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display result (rounds can be fractional, so formatted)
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");

        sc.close();
    }
}
