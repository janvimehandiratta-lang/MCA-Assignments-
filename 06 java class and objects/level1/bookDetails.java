import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("title of book is: " + title);
        System.out.println("author of book is: " + author);
        System.out.println("price of book is: " + price);

    }
}

public class bookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the title of book");
        String t = sc.nextLine();
        System.out.println("enter the author name");
        String a = sc.nextLine();
        System.out.println("enter the price of book");
        int p = sc.nextInt();
        Book b1 = new Book(t, a, p);
        b1.displayDetails();

    }

}