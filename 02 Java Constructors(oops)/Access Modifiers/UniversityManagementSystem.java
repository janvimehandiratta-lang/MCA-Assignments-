// Base class
class Student {
    // Public variable (accessible everywhere)
    public int rollNumber;

    // Protected variable (accessible within same package and subclasses)
    protected String name;

    // Private variable (accessible only within this class)
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("------------------------------");
    }
}

// Subclass
class PostgraduateStudent extends Student {

    private String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Demonstrating access to protected member "name"
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Name (protected access): " + name);
        System.out.println("Roll Number: " + rollNumber); // public access
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA (via getter): " + getCGPA()); // private accessed through public method
        System.out.println("------------------------------");
    }
}

// Main class to test
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Arjun", 8.5);
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Meera", 9.2, "Computer Science");

        System.out.println("Student Details:");
        s1.displayDetails();

        // Modifying CGPA using public setter
        s1.setCGPA(8.8);
        System.out.println("After updating CGPA:");
        s1.displayDetails();

        System.out.println("Postgraduate Student Details:");
        pg1.displayPostgraduateDetails();
    }
}
