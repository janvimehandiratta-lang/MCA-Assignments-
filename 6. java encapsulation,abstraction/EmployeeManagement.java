interface Department {
    void assignDepartment(String deptName);

    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name of employee: " + name);
        System.out.println("Base salary of employee: " + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println("------------------------------------------");
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee implements Department {
    private double allowances;

    // Proper constructor
    FullTimeEmployee(int employeeId, String name, double baseSalary, double allowances) {
        super(employeeId, name, baseSalary);
        this.allowances = allowances;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowances;
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Full-Time Employee Department: " + getDepartment();
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Part-Time Employee Department: " + getDepartment();
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new PartTimeEmployee(12345, "Janvi", 10000, 5, 200);
        Employee emp2 = new FullTimeEmployee(45678, "Priyanshu", 50000, 5000);

        // Assign departments
        ((Department) emp1).assignDepartment("IT");
        ((Department) emp2).assignDepartment("HR");

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
