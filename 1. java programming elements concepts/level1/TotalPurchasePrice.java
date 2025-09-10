import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for unit price and quantity
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
