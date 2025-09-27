// Interface Reservable
interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters for encapsulation
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Loan Duration: " + getLoanDuration()
                + " days";
    }
}

// Subclass Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
        this.borrowerName = null;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = "priyanshu"; // Example borrower
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
        this.borrowerName = null;
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = "navroop"; // Example borrower
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
        this.borrowerName = null;
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = "janvi"; // Example borrower
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class for demonstration
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of library items
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "Java Programming", "Author A");
        items[1] = new Magazine("M001", "Tech Magazine", "Author B");
        items[2] = new DVD("D001", "Learning Java", "Author C");

        // Demonstrate polymorphism
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());

            if (item instanceof Reservable) {
                Reservable res = (Reservable) item;
                System.out.println("Available: " + res.checkAvailability());
                res.reserveItem();
                System.out.println("Available after reservation: " + res.checkAvailability());
            }
            System.out.println("------------------------------------------");
        }
    }
}
