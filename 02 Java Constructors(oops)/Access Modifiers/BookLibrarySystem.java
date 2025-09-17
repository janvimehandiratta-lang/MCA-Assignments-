// Base class
class Book {
    // Public variable (accessible anywhere)
    public String ISBN;

    // Protected variable (accessible within same package and subclasses)
    protected String title;

    // Private variable (accessible only within this class)
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("------------------------------");
    }
}

// Subclass
class EBook extends Book {
    private double fileSize;

    // Constructor
    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Demonstrating access to public (ISBN) and protected (title)
    public void displayEBookDetails() {
        System.out.println("E-Book ISBN (public access): " + ISBN); // public access
        System.out.println("E-Book Title (protected access): " + title); // protected access
        System.out.println("E-Book Author (via getter): " + getAuthor()); // private accessed via method
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("------------------------------");
    }
}

// Main class to test
public class BookLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-81-265-1027-2", "Java Programming", "James Gosling");
        EBook eb1 = new EBook("978-81-265-5555-0", "Effective Java", "Joshua Bloch", 5.6);

        System.out.println("Book Details:");
        b1.displayBookDetails();

        // Changing author using setter
        b1.setAuthor("Herbert Schildt");
        System.out.println("After Updating Author:");
        b1.displayBookDetails();

        System.out.println("E-Book Details:");
        eb1.displayEBookDetails();
    }
}
