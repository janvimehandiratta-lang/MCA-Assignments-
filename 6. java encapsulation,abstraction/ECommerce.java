import java.util.*; // ✅ Move import to the top

// Interface
interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public abstract double calculateDiscount();

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Electronics
class Electronics extends Product implements Taxable {
    private double discountRate = 0.10;
    private double taxRate = 0.18;

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: " + (taxRate * 100) + "%";
    }
}

// Clothing
class Clothing extends Product implements Taxable {
    private double discountRate = 0.20;
    private double taxRate = 0.28;

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (taxRate * 100) + "%";
    }
}

// Groceries (no tax)
class Groceries extends Product {
    private double discountRate = 0.15;

    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}

// Main class
public class ECommerce {

    public static void calculateFinalPrice(Product p) {
        p.displayProductDetails();

        double discount = p.calculateDiscount();
        double tax = 0.0;

        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
            System.out.println(((Taxable) p).getTaxDetails());
        } else {
            System.out.println("No tax applicable for this product.");
        }

        double finalPrice = p.getPrice() + tax - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "T-Shirt", 1500));
        products.add(new Groceries(103, "Rice Bag", 2000));

        // Process all products polymorphically
        for (Product p : products) {
            calculateFinalPrice(p);
        }
    }
}
