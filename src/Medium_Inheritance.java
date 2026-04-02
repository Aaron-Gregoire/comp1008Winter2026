// ============================================================
// MEDIUM INHERITANCE EXERCISES (1-20)
// ============================================================

// ----- M1: Animal -> Cat, Dog (override sound) -----
class M1_Animal {
    void sound() { System.out.println("Some generic animal sound."); }
}
class M1_Cat extends M1_Animal {
    @Override void sound() { System.out.println("Cat says: Meow"); }
}
class M1_Dog extends M1_Animal {
    @Override void sound() { System.out.println("Dog says: Woof"); }
}

// ----- M2: Shape -> Rectangle (area) -----
class M2_Shape {
    double area() { return 0; }
}
class M2_Rectangle extends M2_Shape {
    double length, width;
    M2_Rectangle(double l, double w) { this.length = l; this.width = w; }
    @Override double area() { return length * width; }
}

// ----- M3: Employee -> Manager (salary + bonus) -----
class M3_Employee {
    double salary = 50000;
    double calculateSalary() { return salary; }
}
class M3_Manager extends M3_Employee {
    double bonus = 10000;
    @Override double calculateSalary() { return salary + bonus; }
}

// ----- M4: Vehicle -> Car (speed, gear) -----
class M4_Vehicle {
    int speed = 100;
    void displaySpeed() { System.out.println("Speed: " + speed + " km/h"); }
}
class M4_Car extends M4_Vehicle {
    int gear = 3;
    void displayGear() { System.out.println("Gear: " + gear); }
}

// ----- M5: Multilevel Grandparent -> Parent -> Child -----
class M5_Grandparent {
    void grandMethod() { System.out.println("Grandparent method"); }
}
class M5_Parent extends M5_Grandparent {
    void parentMethod() { System.out.println("Parent method"); }
}
class M5_Child extends M5_Parent {
    void childMethod() { System.out.println("Child method"); }
}

// ----- M6: Person -> Student (super constructor) -----
class M6_Person {
    String name;
    M6_Person(String name) { this.name = name; }
}
class M6_Student extends M6_Person {
    M6_Student(String name) { super(name); }
    void display() { System.out.println("Student name: " + name); }
}

// ----- M7: Shape -> Circle, Rectangle (override draw) -----
class M7_Shape {
    void draw() { System.out.println("Drawing a shape."); }
}
class M7_Circle extends M7_Shape {
    @Override void draw() { System.out.println("Drawing a Circle."); }
}
class M7_Rectangle extends M7_Shape {
    @Override void draw() { System.out.println("Drawing a Rectangle."); }
}

// ----- M8: Appliance -> Fan (override turnOn, print brand) -----
class M8_Appliance {
    String brand = "Panasonic";
    void turnOn() { System.out.println("Appliance turned on."); }
}
class M8_Fan extends M8_Appliance {
    @Override void turnOn() { System.out.println(brand + " fan is spinning."); }
}

// ----- M9: BankAccount -> SavingsAccount (deposit with interest) -----
class M9_BankAccount {
    double balance = 1000;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }
}
class M9_SavingsAccount extends M9_BankAccount {
    double interestRate = 0.05;
    @Override void deposit(double amount) {
        double withInterest = amount + (amount * interestRate);
        balance += withInterest;
        System.out.println("Deposited with interest: " + withInterest + " | Balance: " + balance);
    }
}

// ----- M10: Animal -> Dog (super.eat + own message) -----
class M10_Animal {
    void eat() { System.out.println("Animal is eating."); }
}
class M10_Dog extends M10_Animal {
    @Override void eat() {
        super.eat();
        System.out.println("Dog is eating a bone.");
    }
}

// ----- M11: Person -> Teacher (name, age, subject) -----
class M11_Person {
    String name;
    int age;
    M11_Person(String name, int age) { this.name = name; this.age = age; }
}
class M11_Teacher extends M11_Person {
    String subject;
    M11_Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

// ----- M12: Vehicle -> Bike (override start) -----
class M12_Vehicle {
    void start() { System.out.println("Vehicle starting."); }
    void stop()  { System.out.println("Vehicle stopping."); }
}
class M12_Bike extends M12_Vehicle {
    @Override void start() { System.out.println("Bike starting with a kick."); }
}

// ----- M13: Employee -> Manager (id, salary, teamSize) -----
class M13_Employee {
    int id; double salary;
    M13_Employee(int id, double salary) { this.id = id; this.salary = salary; }
}
class M13_Manager extends M13_Employee {
    int teamSize;
    M13_Manager(int id, double salary, int teamSize) {
        super(id, salary);
        this.teamSize = teamSize;
    }
    void display() {
        System.out.println("ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}

// ----- M14: Shape -> Square (area by side) -----
class M14_Shape {
    double calculateArea() { return 0; }
}
class M14_Square extends M14_Shape {
    double side;
    M14_Square(double side) { this.side = side; }
    @Override double calculateArea() { return side * side; }
}

// ----- M15: Person -> Student (super.greet + own greet) -----
class M15_Person {
    void greet() { System.out.println("Hello, I am a Person."); }
}
class M15_Student extends M15_Person {
    @Override void greet() {
        super.greet();
        System.out.println("And I am also a Student.");
    }
}

// ----- M16: Device -> Laptop (override turnOn, call super first) -----
class M16_Device {
    void turnOn() { System.out.println("Device powering on..."); }
}
class M16_Laptop extends M16_Device {
    @Override void turnOn() {
        super.turnOn();
        System.out.println("Laptop loading operating system.");
    }
}

// ----- M17: Vehicle -> Car -> ElectricCar (multilevel attributes) -----
class M17_Vehicle {
    String make = "Tesla";
}
class M17_Car extends M17_Vehicle {
    int year = 2023;
}
class M17_ElectricCar extends M17_Car {
    int batteryRange = 400;
    void display() {
        System.out.println("Make: " + make + ", Year: " + year + ", Range: " + batteryRange + " km");
    }
}

// ----- M18: Employee -> Developer (override work) -----
class M18_Employee {
    void work() { System.out.println("Employee is working."); }
}
class M18_Developer extends M18_Employee {
    @Override void work() { System.out.println("Developer is writing code."); }
}

// ----- M19: Animal -> Cat (override sound -> Meow) -----
class M19_Animal {
    void sound() { System.out.println("..."); }
}
class M19_Cat extends M19_Animal {
    @Override void sound() { System.out.println("Meow"); }
}

// ----- M20: BankAccount -> CheckingAccount (accountNumber via constructor) -----
class M20_BankAccount {
    String accountNumber;
    M20_BankAccount(String accountNumber) { this.accountNumber = accountNumber; }
}
class M20_CheckingAccount extends M20_BankAccount {
    M20_CheckingAccount(String accountNumber) { super(accountNumber); }
    void display() { System.out.println("Checking Account Number: " + accountNumber); }
}

// ============================================================
// MAIN - run all medium exercises
// ============================================================
public class Medium_Inheritance {
    public static void main(String[] args) {
        System.out.println("=== M1: Animal Sounds ===");
        new M1_Cat().sound();
        new M1_Dog().sound();

        System.out.println("\n=== M2: Rectangle Area ===");
        System.out.println("Area: " + new M2_Rectangle(5, 3).area());

        System.out.println("\n=== M3: Manager Salary ===");
        System.out.println("Manager total: " + new M3_Manager().calculateSalary());

        System.out.println("\n=== M4: Car Speed & Gear ===");
        M4_Car car = new M4_Car();
        car.displaySpeed();
        car.displayGear();

        System.out.println("\n=== M5: Multilevel Inheritance ===");
        M5_Child child = new M5_Child();
        child.grandMethod();
        child.parentMethod();
        child.childMethod();

        System.out.println("\n=== M6: Student Constructor ===");
        new M6_Student("Bob").display();

        System.out.println("\n=== M7: Draw Shapes ===");
        new M7_Circle().draw();
        new M7_Rectangle().draw();

        System.out.println("\n=== M8: Fan turnOn ===");
        new M8_Fan().turnOn();

        System.out.println("\n=== M9: Savings Deposit ===");
        new M9_SavingsAccount().deposit(500);

        System.out.println("\n=== M10: Dog eat (super call) ===");
        new M10_Dog().eat();

        System.out.println("\n=== M11: Teacher Details ===");
        new M11_Teacher("Ms. Smith", 35, "Math").display();

        System.out.println("\n=== M12: Bike Start ===");
        new M12_Bike().start();
        new M12_Bike().stop();

        System.out.println("\n=== M13: Manager Info ===");
        new M13_Manager(202, 75000, 8).display();

        System.out.println("\n=== M14: Square Area ===");
        System.out.println("Area: " + new M14_Square(4).calculateArea());

        System.out.println("\n=== M15: Student greet (super) ===");
        new M15_Student().greet();

        System.out.println("\n=== M16: Laptop turnOn ===");
        new M16_Laptop().turnOn();

        System.out.println("\n=== M17: ElectricCar Details ===");
        new M17_ElectricCar().display();

        System.out.println("\n=== M18: Developer Work ===");
        new M18_Developer().work();

        System.out.println("\n=== M19: Cat Sound ===");
        new M19_Cat().sound();

        System.out.println("\n=== M20: Checking Account ===");
        new M20_CheckingAccount("CHK-98765").display();
    }
}
