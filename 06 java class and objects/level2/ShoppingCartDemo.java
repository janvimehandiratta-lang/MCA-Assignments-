import java.util.Scanner;

// User-defined CartItem class
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items (increase quantity)
    void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " " + itemName + "(s) added to the cart.");
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Method to remove items (decrease quantity)
    void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from the cart.");
        } else {
            System.out.println("Invalid quantity to remove!");
        }
    }

    // Method to calculate total cost
    double getTotalCost() {
        return price * quantity;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + getTotalCost());
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input item details
        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        // Create CartItem object
        CartItem item = new CartItem(name, price, qty);

        // Display initial details
        System.out.println("\nCart Details:");
        item.displayDetails();

        // Demonstrate add/remove
        System.out.print("\nEnter quantity to add: ");
        int addQty = sc.nextInt();
        item.addItem(addQty);
        item.displayDetails();

        System.out.print("\nEnter quantity to remove: ");
        int removeQty = sc.nextInt();
        item.removeItem(removeQty);
        item.displayDetails();
    }
}
