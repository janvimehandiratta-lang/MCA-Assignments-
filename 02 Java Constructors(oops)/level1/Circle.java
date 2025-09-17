class Circle {
    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // constructor chaining → calls parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.displayCircle();

        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.displayCircle();
    }
}
