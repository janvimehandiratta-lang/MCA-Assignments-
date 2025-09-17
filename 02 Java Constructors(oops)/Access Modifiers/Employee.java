// Base class
class Employee {
    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }

    // Display details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------------");
    }
}

// Subclass
class Manager extends Employee {
    private int teamSize;

    // Constructor
    Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Demonstrating access
    public void displayManagerDetails() {
        System.out.println("Manager Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Team Size: " + teamSize);
        System.out.println("------------------------------");
    }
}
