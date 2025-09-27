// Interface Discountable
interface Discountable {
    void applyDiscount(double percent);

    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity + ", Total: $"
                + calculateTotalPrice();
    }
}

// Subclass VegItem
class VegItem extends FoodItem implements Discountable {
    private double discountPercent;

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercent = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) * (1 - discountPercent / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountPercent + "%";
    }
}

// Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double discountPercent;

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercent = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return ((getPrice() * getQuantity()) + 10) * (1 - discountPercent / 100); // Additional $10 for non-veg
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountPercent + "%";
    }
}

// Main class for demonstration
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create a list of food items
        FoodItem[] items = new FoodItem[2];
        items[0] = new VegItem("Salad", 5.0, 2);
        items[1] = new NonVegItem("Burger", 10.0, 1);

        // Demonstrate polymorphism
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable disc = (Discountable) item;
                disc.applyDiscount(10); // 10% discount
                System.out.println("After discount: " + item.getItemDetails());
                System.out.println(disc.getDiscountDetails());
            }
            System.out.println("------------------------------------------");
        }
    }
}
