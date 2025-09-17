class Person {
    // Attributes
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using parameterized constructor
        Person p1 = new Person("janvi", 21);
        p1.displayPerson();

        // Using copy constructor
        Person p2 = new Person(p1);
        p2.displayPerson();
    }
}
