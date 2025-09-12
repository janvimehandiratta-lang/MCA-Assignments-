import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate chocolates per child and remaining
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // quotient
        int remainingChocolates = numberOfChocolates % numberOfChildren; // remainder
        return new int[] { chocolatesPerChild, remainingChocolates };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Children cannot be zero! Division not possible.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates = " + result[1]);
        }

        sc.close();
    }
}
