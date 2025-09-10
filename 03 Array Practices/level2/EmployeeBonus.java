package level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEES = 10;

        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Step 1: Input salary and years of service
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary (INR): ");
            double s = input.nextDouble();

            System.out.print("Years of Service: ");
            double y = input.nextDouble();

            // Validate inputs
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Salary must be > 0 and years >= 0. Try again.");
                i--; // decrement to retry same employee
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Step 2: Calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Display results
        System.out.println("\n--- Employee Salary & Bonus Details ---");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: INR " + salary[i] +
                    " | Bonus: INR " + bonus[i] +
                    " | New Salary: INR " + newSalary[i]);
        }

        System.out.println("\n--- Totals for Zara ---");
        System.out.println("Total Old Salary: INR " + totalOldSalary);
        System.out.println("Total Bonus Payout: INR " + totalBonus);
        System.out.println("Total New Salary: INR " + totalNewSalary);

        input.close();
    }
}
