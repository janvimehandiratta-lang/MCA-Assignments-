package level3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get an integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize count to 0
        int count = 0;

        // Handle case when number = 0 (since 0 has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Use loop until number becomes 0
            while (number != 0) {
                // Step 4: Remove last digit
                number = number / 10;

                // Step 5: Increase count
                count++;
            }
        }

        // Step 6: Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
