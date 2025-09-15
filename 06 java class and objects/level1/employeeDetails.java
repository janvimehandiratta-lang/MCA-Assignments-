class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class employeeDetails {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("janvi", 101, 50000);
        Employee emp2 = new Employee("priyu", 102, 60000);

        // Displaying employee details
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
