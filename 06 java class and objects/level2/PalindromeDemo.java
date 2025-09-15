import java.util.Scanner;

// User-defined class
class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {
        String lower = text.toLowerCase(); // ignore case
        int left = 0, right = lower.length() - 1;

        while (left < right) {
            if (lower.charAt(left) != lower.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }
}

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to check: ");
        String input = sc.nextLine();

        // Create object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Display result
        checker.displayResult();
    }
}
