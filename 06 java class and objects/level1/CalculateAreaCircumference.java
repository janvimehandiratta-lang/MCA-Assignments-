import java.util.Scanner;

class Circle {
    // attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double pi = 3.14;
        return pi * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius of the circle is: " + radius);
        System.out.println("Area of the circle is: " + calculateArea());
        System.out.println("Circumference of the circle is: " + calculateCircumference());
    }
}

public class CalculateAreaCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of radius: ");
        double r = sc.nextDouble();

        // Create Circle object using constructor
        Circle c1 = new Circle(r);

        // Display circle details
        c1.displayDetails();
    }
}
