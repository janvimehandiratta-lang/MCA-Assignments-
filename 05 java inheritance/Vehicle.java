public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Car");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("--------------------------");
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("--------------------------");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
        System.out.println("--------------------------");
    }
}

class main7 {
    public static void main(String[] args) {
        // Polymorphism: array of Vehicle references
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.0);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
