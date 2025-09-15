import java.util.Scanner;

// User-defined Item class
class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking item details from user
        System.out.print("Enter item code: ");
        int code = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        // Create Item object
        Item item1 = new Item(code, name, price);

        // Display item details
        System.out.println("\nItem Details:");
        item1.displayDetails();

        // Get quantity from user
        System.out.print("\nEnter quantity: ");
        int qty = sc.nextInt();

        // Calculate total cost
        double total = item1.calculateTotalCost(qty);
        System.out.println("Total cost for " + qty + " items = " + total);
    }
}
