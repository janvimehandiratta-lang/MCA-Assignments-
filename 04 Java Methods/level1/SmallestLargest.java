import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest in one go
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Check smallest
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;

        // Check largest
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;

        // return both values in an array
        return new int[] { smallest, largest };
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number2:");
        int num2 = sc.nextInt();
        System.out.println("Enter number3:");
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest  = " + result[1]);

        sc.close();
    }
}
