package level2;

import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    // Generate random scores for PCM (Physics, Chemistry, Math)
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101); // Physics
            scores[i][1] = rand.nextInt(101); // Chemistry
            scores[i][2] = rand.nextInt(101); // Math
        }

        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3]; // [][0]=Total, [1]=Average, [2]=Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((average * 100.0) / 100); // Rounded to 2 decimal

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = percentage;
        }

        return stats;
    }

    // Assign grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numStudents = stats.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percent = stats[i][2];

            if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else if (percent >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    // Display the full scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("ID\tPhysics\tChem\tMath\tTotal\tAverage\t\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // b. Generate scores
        int[][] scores = generateScores(numStudents);

        // c. Calculate total, average, percentage
        double[][] stats = calculateStats(scores);

        // d. Calculate grades
        String[] grades = calculateGrades(stats);

        // e. Display scorecard
        displayScorecard(scores, stats, grades);

        scanner.close();
    }
}
