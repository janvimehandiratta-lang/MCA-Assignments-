// Interface Insurable
interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}

// Subclass Car
class Car extends Vehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate;

    Car(String vehicleNumber, double rentalRate, String policyNumber, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber + ", Insurance Rate: $" + insuranceRate;
    }
}

// Subclass Bike
class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate;

    Bike(String vehicleNumber, double rentalRate, String policyNumber, double insuranceRate) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // Discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber + ", Insurance Rate: $" + insuranceRate;
    }
}

// Subclass Truck
class Truck extends Vehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate;

    Truck(String vehicleNumber, double rentalRate, String policyNumber, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // Surcharge for trucks
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber + ", Insurance Rate: $" + insuranceRate;
    }
}

// Main class for demonstration
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("CAR123", 50.0, "POLCAR001", 20.0);
        vehicles[1] = new Bike("BIKE456", 30.0, "POLBIKE002", 10.0);
        vehicles[2] = new Truck("TRUCK789", 80.0, "POLTRUCK003", 40.0);

        // Demonstrate polymorphism
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            double rentalCost = v.calculateRentalCost(5); // 5 days
            System.out.println("Rental Cost for 5 days: $" + rentalCost);
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                double insurance = ins.calculateInsurance();
                String details = ins.getInsuranceDetails();
                System.out.println("Insurance Cost: $" + insurance);
                System.out.println("Insurance Details: " + details);
            }
            System.out.println("------------------------------------------");
        }
    }
}
