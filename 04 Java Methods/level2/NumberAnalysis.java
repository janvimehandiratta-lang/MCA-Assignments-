import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // return 1 if num1 > num2
    // return 0 if num1 == num2
    // return -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else {
                System.out.println("Number " + num + " is Negative.");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\n--- Comparison of First and Last Element ---");
        if (result == 0) {
            System.out.println("First element (" + numbers[0] + ") and last element (" + numbers[4] + ") are Equal.");
        } else if (result == 1) {
            System.out.println("First element (" + numbers[0] + ") is Greater than last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is Less than last element (" + numbers[4] + ").");
        }

        sc.close();
    }
}
