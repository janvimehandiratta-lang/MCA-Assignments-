package level2;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] age = new int[3];
        double[] height = new double[3];

        // Step 1: Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Age: ");
            age[i] = input.nextInt();

            System.out.print("Height (in cm): ");
            height[i] = input.nextDouble();
        }

        // Step 2: Find youngest
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Step 3: Find tallest
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Step 4: Display results
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[minAgeIndex] + " (Age: " + age[minAgeIndex] + ")");
        System.out.println(
                "The tallest friend is " + names[maxHeightIndex] + " (Height: " + height[maxHeightIndex] + " cm)");

        input.close();
    }
}
