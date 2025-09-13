import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generate number in the range [100000, 999999]
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Print OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
