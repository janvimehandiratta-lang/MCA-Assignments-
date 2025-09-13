import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index] + " (Age: " + minAge + ")";
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index] + " (Height: " + maxHeight + " cm)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        sc.close();
    }
}
