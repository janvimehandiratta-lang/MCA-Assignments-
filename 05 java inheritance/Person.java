public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void displayRole() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Name of Teacher : " + name);
        System.out.println("Age of Teacher: " + age);
        System.out.println("Subject Alloted : " + subject);
    }

}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Name of Student : " + name);
        System.out.println("Age of Student: " + age);
        System.out.println("grade : " + grade);
    }
}

class Staff extends Person {
    String staffType;

    Staff(String name, int age, String staffType) {
        super(name, age);
        this.staffType = staffType;
    }

    void displayRole() {
        System.out.println("Name of Staff : " + name);
        System.out.println("Age of Staff: " + age);
        System.out.println("Staff Type : " + staffType);
    }

}

class main4 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("meenakshi", 40, "Maths");
        Student s1 = new Student("janvi", 21, "O");
        Staff s2 = new Staff("Hema", 42, "Pion");
        t1.displayRole();
        System.out.println("-------------------------");
        s1.displayRole();
        System.out.println("-------------------------");
        s2.displayRole();
    }
}