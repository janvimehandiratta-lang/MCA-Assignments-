// Interface GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public String getVehicleDetails() {
        return "ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: $" + ratePerKm;
    }
}

// Subclass Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Subclass Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // Discount for bike
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2; // Surcharge for auto
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Main class for demonstration
public class RideHailingApp {
    public static void main(String[] args) {
        // Create a list of vehicles
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("C001", "janvi", 2.0, "Downtown");
        vehicles[1] = new Bike("B001", "priyanshu", 1.5, "Uptown");
        vehicles[2] = new Auto("A001", "navroop", 1.8, "Airport");

        // Demonstrate polymorphism
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            double fare = v.calculateFare(10); // 10 km
            System.out.println("Fare for 10 km: $" + fare);

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println("------------------------------------------");
        }
    }
}
