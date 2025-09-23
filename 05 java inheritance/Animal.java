public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animals make sound");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Dog barksss!!!!");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Cat Meowww!!!!");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Bird chirpss!!!!");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }
}

class main5 {
    public static void main(String[] args) {
        Dog d1 = new Dog("sheerooo", 10);
        Cat c1 = new Cat("cattyyy", 4);
        Bird b1 = new Bird("chikkkii", 2);
        d1.makeSound();
        System.out.println("-------------------------");
        c1.makeSound();
        System.out.println("-------------------------");
        b1.makeSound();

    }
}
