import java.util.Scanner;

public class HandshakeProgram {

    // Method to calculate maximum number of handshakes
    public static int findMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2; // Combination formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Call method
        int maxHandshakes = findMaxHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes among "
                + numberOfStudents + " students is: " + maxHandshakes);

        sc.close();
    }
}
