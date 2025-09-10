package level3;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian Calendar).");
        } else {
            // ---------- PART 1: Multiple if-else statements ----------
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (using if-else).");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year (using if-else).");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (using if-else).");
            } else {
                System.out.println(year + " is NOT a Leap Year (using if-else).");
            }

            // ---------- PART 2: Single if with logical operators ----------
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year (using single if).");
            } else {
                System.out.println(year + " is NOT a Leap Year (using single if).");
            }
        }
    }
}
