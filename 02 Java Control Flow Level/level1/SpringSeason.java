package level1;

public class SpringSeason {
    public static void main(String[] args) {
        // Taking month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check Spring Season
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 - 31
                (month == 4 && day >= 1 && day <= 30) || // April
                (month == 5 && day >= 1 && day <= 31) || // May
                (month == 6 && day >= 1 && day <= 20)) { // June 1 - 20
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
