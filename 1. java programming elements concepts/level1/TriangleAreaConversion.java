import java.util.Scanner;

public class TriangleAreaConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();

        // Calculate area in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert cm to inches and calculate area in square inches
        double baseIn = baseCm / 2.54;
        double heightIn = heightCm / 2.54;
        double areaIn2 = 0.5 * baseIn * heightIn;

        // Display results
        System.out.println("The area of the triangle in sq cm is " + areaCm2 +
                           " and in sq in is " + areaIn2);

        input.close();
    }
}
