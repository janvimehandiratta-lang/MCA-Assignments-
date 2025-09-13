import java.util.Scanner;

public class LeapYearCheck {

    // Method to check leap year
    static boolean isLeapYear(int year) {
        // Condition a: divisible by 4 and not divisible by 100
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);

        // Condition b: divisible by 400
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check valid Gregorian calendar year
        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
            return;
        }

        // Check leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
