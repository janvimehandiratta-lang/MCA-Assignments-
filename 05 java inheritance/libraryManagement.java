class Book {
    String title;
    String publicationYear;

    void book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    void author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("title of book is:  " + title);
        System.out.println("publication year of book is:  " + publicationYear);
        System.out.println("name of Author is:  " + name);
        System.out.println("bio of book is:  " + bio);
    }

}

public class libraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author();
        a1.book("It Starts with You", "2022");
        a1.author("Nicole Schwarz", "How Imperfect Parents Can Find Calm and Connection with Their Kids");
        a1.displayInfo();
    }

}