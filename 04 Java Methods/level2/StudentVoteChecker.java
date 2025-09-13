import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        }
        return age >= 18; // true if 18 or above, false otherwise
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10]; // array to store ages of 10 students

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check and display eligibility
        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < ages.length; i++) {
            boolean eligible = canStudentVote(ages[i]);
            if (eligible) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is NOT eligible to vote.");
            }
        }

        sc.close();
    }
}
