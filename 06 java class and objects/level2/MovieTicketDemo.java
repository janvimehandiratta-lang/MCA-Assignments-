import java.util.Scanner;

// User-defined MovieTicket class
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Method to book a ticket
    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input movie name
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket(movie);

        // Input seat and price
        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        // Book the ticket
        ticket.bookTicket(seat, price);

        // Display ticket details
        System.out.println("\nTicket Details:");
        ticket.displayDetails();
    }
}
