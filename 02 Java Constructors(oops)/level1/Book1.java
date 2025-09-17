class Book1 {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default Constructor
    public Book1() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized Constructor
    public Book1(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return a book
    public void returnBook() {
        available = true;
        System.out.println("You have returned: " + title);
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("-------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating books
        Book1 b1 = new Book1("The Alchemist", "Paulo Coelho", 399.99, true);
        Book1 b2 = new Book1("Rich Dad Poor Dad", "Robert Kiyosaki", 299.99, true);

        // Display initial details
        b1.displayBook();
        b2.displayBook();

        // Borrow and return operations
        b1.borrowBook(); // borrowing first book
        b1.borrowBook(); // trying to borrow again (unavailable now)
        b1.returnBook(); // returning book
        b1.borrowBook(); // borrowing again after return
    }
}
