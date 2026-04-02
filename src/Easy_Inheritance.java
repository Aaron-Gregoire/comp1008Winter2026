// ============================================================
// EASY INHERITANCE EXERCISES (1-10)
// ============================================================

// ----- Exercise 1: Vehicle -> Car -----
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public static void main_E1(String[] args) {
        Car car = new Car();
        car.start();
    }
}

// ----- Exercise 2: Animal -> Dog (eat) -----
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public static void main_E2(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

// ----- Exercise 3: Shape -> Circle (color) -----
class Shape {
    String color = "Red";
}

class Circle extends Shape {
    public static void main_E3(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle color: " + circle.color);
    }
}

// ----- Exercise 4: Employee -> Manager (name, id) -----
class Employee {
    String name = "Alice";
    int id = 101;
}

class Manager extends Employee {
    public static void main_E4(String[] args) {
        Manager mgr = new Manager();
        System.out.println("Name: " + mgr.name + ", ID: " + mgr.id);
    }
}

// ----- Exercise 5: Bird -> Parrot (override fly) -----
class Bird {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class Parrot extends Bird {
    @Override
    void fly() {
        System.out.println("Parrot is flying colorfully!");
    }

    public static void main_E5(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
    }
}

// ----- Exercise 6: Person -> Student (walk) -----
class Person {
    void walk() {
        System.out.println("Person is walking.");
    }
}

class Student extends Person {
    public static void main_E6(String[] args) {
        Student student = new Student();
        student.walk();
    }
}

// ----- Exercise 7: Phone -> SmartPhone (brand) -----
class Phone {
    String brand = "Samsung";
}

class SmartPhone extends Phone {
    public static void main_E7(String[] args) {
        SmartPhone sp = new SmartPhone();
        System.out.println("Brand: " + sp.brand);
    }
}

// ----- Exercise 8: Book -> Novel (override displayTitle) -----
class Book {
    void displayTitle() {
        System.out.println("Book title: Unknown");
    }
}

class Novel extends Book {
    @Override
    void displayTitle() {
        System.out.println("Novel title: The Great Gatsby");
    }

    public static void main_E8(String[] args) {
        Novel novel = new Novel();
        novel.displayTitle();
    }
}

// ----- Exercise 9: Bank -> SavingsAccount (deposit) -----
class Bank {
    void deposit() {
        System.out.println("Depositing money into bank.");
    }
}

class SavingsAccount extends Bank {
    public static void main_E9(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
    }
}

// ----- Exercise 10: Appliance -> WashingMachine (override turnOn) -----
class Appliance {
    void turnOn() {
        System.out.println("Appliance turned on.");
    }
}

class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Washing Machine is now running.");
    }

    public static void main_E10(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.turnOn();
    }
}

// ============================================================
// MAIN - run all easy exercises
// ============================================================
public class Easy_Inheritance {
    public static void main(String[] args) {
        System.out.println("=== Exercise 1 ===");
        Car.main_E1(args);

        System.out.println("\n=== Exercise 2 ===");
        Dog.main_E2(args);

        System.out.println("\n=== Exercise 3 ===");
        Circle.main_E3(args);

        System.out.println("\n=== Exercise 4 ===");
        Manager.main_E4(args);

        System.out.println("\n=== Exercise 5 ===");
        Parrot.main_E5(args);

        System.out.println("\n=== Exercise 6 ===");
        Student.main_E6(args);

        System.out.println("\n=== Exercise 7 ===");
        SmartPhone.main_E7(args);

        System.out.println("\n=== Exercise 8 ===");
        Novel.main_E8(args);

        System.out.println("\n=== Exercise 9 ===");
        SavingsAccount.main_E9(args);

        System.out.println("\n=== Exercise 10 ===");
        WashingMachine.main_E10(args);
    }
}
