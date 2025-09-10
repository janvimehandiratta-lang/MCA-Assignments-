import java.util.Scanner;

public class KmToMilesConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // Taking user input

        double miles = km / 1.6; // Since 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
