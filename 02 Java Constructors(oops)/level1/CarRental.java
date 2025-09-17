class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate cost (sample rates per day)
    public double calculateTotalCost() {
        double rate;
        switch (carModel.toLowerCase()) {
            case "suv":
                rate = 2000.0;
                break;
            case "sedan":
                rate = 1500.0;
                break;
            case "hatchback":
                rate = 1000.0;
                break;
            default:
                rate = 1200.0; // Standard rate
        }
        return rate * rentalDays;
    }

    // Method to display rental details
    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("-------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRental();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Neena", "SUV", 5);
        rental2.displayRental();

        CarRental rental3 = new CarRental("Arjun", "Sedan", 3);
        rental3.displayRental();
    }
}
