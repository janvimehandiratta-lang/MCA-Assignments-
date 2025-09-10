package level2;
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step a: Take input for number of students
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        // Step b: Create 2D array for marks, and arrays for percentage & grades
        int[][] marks = new int[number][3];   // row = student, col = subjects
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Step c: Take input for marks of each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                int mark;
                do {
                    System.out.print(subject + " marks: ");
                    mark = input.nextInt();
                    if (mark < 0) {
                        System.out.println("❌ Invalid! Marks must be positive. Try again.");
                    }
                } while (mark < 0);

                marks[i][j] = mark;
            }
        }

        // Step d: Compute percentage and grade
        for (int i = 0; i < number; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Step e: Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + marks[i][0] +
                    " | Chemistry: " + marks[i][1] +
                    " | Maths: " + marks[i][2] +
                    " | Percentage: " + String.format("%.2f", percentage[i]) + "%" +
                    " | Grade: " + grade[i]);
        }

        input.close();
    }
}
