public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // text is null
        // This will throw NullPointerException
        System.out.println("Length of string: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // text is null
        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException (without handling):");
        try {
            generateException(); // This will cause program crash if not caught
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nDemonstrating NullPointerException (with handling):");
        handleException(); // This will handle the exception gracefully
    }
}
