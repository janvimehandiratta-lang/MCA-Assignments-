import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes using combination formula nC2 =
        // n*(n-1)/2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println(
                "The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        input.close();
    }
}
