public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee's name:" + name);
        System.out.println("Employee's id:" + id);
        System.out.println("Employee's salary:" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        System.out.println("Manager's name:" + name);
        System.out.println("Manager's id:" + id);
        System.out.println("Manager's salary:" + salary);
        System.out.println("Manager's team size:" + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        System.out.println("Developer's name:" + name);
        System.out.println("Developer's id:" + id);
        System.out.println("Developer's salary:" + salary);
        System.out.println("Developer's speciality programming language:" + programmingLanguage);
    }

}

class Intern extends Employee {
    String internshipType;

    Intern(String name, int id, double salary, String internshipType) {
        super(name, id, salary);
        this.internshipType = internshipType;
    }

    void displayDetails() {
        System.out.println("Interner's name:" + name);
        System.out.println("Interner's id:" + id);
        System.out.println("Interner's salary:" + salary);
        System.out.println("Interner's internship type:" + internshipType);
    }
}

class main6 {
    public static void main(String[] args) {
        Manager m1 = new Manager("rakesh", 102, 100000, 10);
        Developer d1 = new Developer("shivam", 105, 50000, "java");
        Intern i1 = new Intern("janvi", 405, 10000, "web development");
        m1.displayDetails();
        System.out.println("-------------------------");
        d1.displayDetails();
        System.out.println("-------------------------");
        i1.displayDetails();
        System.out.println("-------------------------");
    }
}