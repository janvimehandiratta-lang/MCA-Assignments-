import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // Combination formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Call method to calculate handshakes
        int handshakes = calculateHandshakes(n);

        // Display result
        System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);

        sc.close();
    }
}
