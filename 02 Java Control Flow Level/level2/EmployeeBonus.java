package level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check service condition
        if (years > 5) {
            double bonus = 0.05 * salary; // 5% of salary
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonus! Years of service are less than or equal to 5.");
        }

    }
}
