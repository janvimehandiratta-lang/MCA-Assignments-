import java.util.Scanner;

public class NumberCheck {

    // Method to check number sign
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // Positive
        } else if (num < 0) {
            return -1;  // Negative
        } else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println(number + " is Positive.");
        } else if (result == -1) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println(number + " is Zero.");
        }

        sc.close();
    }
}
