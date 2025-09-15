import java.util.Scanner;

// User-defined MobilePhone class
class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter phone brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter phone model: ");
        String model = sc.nextLine();

        System.out.print("Enter phone price: ");
        double price = sc.nextDouble();

        // Create MobilePhone object
        MobilePhone phone1 = new MobilePhone(brand, model, price);

        // Display details
        System.out.println("\nMobile Phone Details:");
        phone1.displayDetails();
    }
}
