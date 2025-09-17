class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayBook();

        System.out.println();

        // Using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 399.99);
        book2.displayBook();
    }
}
