class Vehicle {
    // Class variable (common for all vehicles)
    static double registrationFee = 5000.0;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("------------------------------");
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

// Main class to test
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("janvi", "activa");
        Vehicle v2 = new Vehicle("kashish", "car");

        System.out.println("Before Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("After Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
