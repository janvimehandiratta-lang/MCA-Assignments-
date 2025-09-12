public class SpringSeason {

    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Spring: March 20 to June 20
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 - March 31
                (month == 4 && day >= 1 && day <= 30) || // April
                (month == 5 && day >= 1 && day <= 31) || // May
                (month == 6 && day >= 1 && day <= 20)) { // June 1 - June 20
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Take input from command line
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
