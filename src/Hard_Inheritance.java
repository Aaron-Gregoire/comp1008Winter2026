// ============================================================
// HARD INHERITANCE EXERCISES (1-20)
// ============================================================

// ----- H1: Employee -> Manager, Developer (override calculateBonus) -----
class H1_Employee {
    String name; int id; double salary;
    H1_Employee(String name, int id, double salary) {
        this.name = name; this.id = id; this.salary = salary;
    }
    double calculateBonus() { return 0; }
}
class H1_Manager extends H1_Employee {
    H1_Manager(String name, int id, double salary) { super(name, id, salary); }
    @Override double calculateBonus() { return salary * 0.20; }
}
class H1_Developer extends H1_Employee {
    H1_Developer(String name, int id, double salary) { super(name, id, salary); }
    @Override double calculateBonus() { return salary * 0.15; }
}

// ----- H2: Person -> Student -> CollegeStudent (constructors + attributes) -----
class H2_Person {
    String name;
    H2_Person(String name) {
        this.name = name;
        System.out.println("Person constructor: " + name);
    }
}
class H2_Student extends H2_Person {
    int studentId;
    H2_Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
        System.out.println("Student constructor: ID=" + studentId);
    }
}
class H2_CollegeStudent extends H2_Student {
    String major;
    H2_CollegeStudent(String name, int studentId, String major) {
        super(name, studentId);
        this.major = major;
        System.out.println("CollegeStudent constructor: Major=" + major);
    }
    void display() {
        System.out.println("Name: " + name + ", ID: " + studentId + ", Major: " + major);
    }
}

// ----- H3: wk13.Vehicle -> wk13.Car -> ElectricCar (speed, fuel, gear, batteryLevel) -----
class H3_Vehicle {
    int speed; String fuel;
    H3_Vehicle(int speed, String fuel) { this.speed = speed; this.fuel = fuel; }
}
class H3_Car extends H3_Vehicle {
    int gear;
    H3_Car(int speed, String fuel, int gear) { super(speed, fuel); this.gear = gear; }
}
class H3_ElectricCar extends H3_Car {
    int batteryLevel;
    H3_ElectricCar(int speed, String fuel, int gear, int batteryLevel) {
        super(speed, fuel, gear);
        this.batteryLevel = batteryLevel;
    }
    void display() {
        System.out.println("Speed: " + speed + ", Fuel: " + fuel +
                           ", Gear: " + gear + ", Battery: " + batteryLevel + "%");
    }
}

// ----- H4: Shape -> Circle, Rectangle, Triangle (different area calculations) -----
class H4_Shape {
    String color;
    H4_Shape(String color) { this.color = color; }
    double area() { return 0; }
}
class H4_Circle extends H4_Shape {
    double radius;
    H4_Circle(String color, double radius) { super(color); this.radius = radius; }
    @Override double area() { return Math.PI * radius * radius; }
}
class H4_Rectangle extends H4_Shape {
    double length, width;
    H4_Rectangle(String color, double l, double w) { super(color); this.length = l; this.width = w; }
    @Override double area() { return length * width; }
}
class H4_Triangle extends H4_Shape {
    double base, height;
    H4_Triangle(String color, double base, double height) {
        super(color); this.base = base; this.height = height;
    }
    @Override double area() { return 0.5 * base * height; }
}

// ----- H5: BankAccount -> SavingsAccount (interest), CheckingAccount (overdraft) -----
class H5_BankAccount {
    double balance;
    H5_BankAccount(double balance) { this.balance = balance; }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }
}
class H5_SavingsAccount extends H5_BankAccount {
    double interestRate = 0.04;
    H5_SavingsAccount(double balance) { super(balance); }
    @Override void deposit(double amount) {
        double total = amount * (1 + interestRate);
        balance += total;
        System.out.println("Savings deposit with interest: " + total + " | Balance: " + balance);
    }
}
class H5_CheckingAccount extends H5_BankAccount {
    double overdraftLimit = 500;
    H5_CheckingAccount(double balance) { super(balance); }
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}

// ----- H6: Person -> Student (super keyword + this keyword) -----
class H6_Person {
    String name = "Person Name";
    void display() { System.out.println("Person name: " + name); }
}
class H6_Student extends H6_Person {
    String name = "Student Name";
    void display() {
        System.out.println("this.name  = " + this.name);
        System.out.println("super.name = " + super.name);
        super.display();
    }
}

// ----- H7: Employee -> Manager -> SeniorManager (override work) -----
class H7_Employee {
    void work() { System.out.println("Employee: doing general tasks."); }
}
class H7_Manager extends H7_Employee {
    @Override void work() { System.out.println("Manager: managing the team."); }
}
class H7_SeniorManager extends H7_Manager {
    @Override void work() { System.out.println("Senior Manager: setting strategy."); }
}

// ----- H8: Device -> Laptop, Phone (override turnOn and display) -----
class H8_Device {
    String brand;
    H8_Device(String brand) { this.brand = brand; }
    void turnOn() { System.out.println(brand + " device turning on."); }
}
class H8_Laptop extends H8_Device {
    H8_Laptop(String brand) { super(brand); }
    @Override void turnOn() { System.out.println(brand + " laptop booting up."); }
    void display() { System.out.println(brand + " laptop showing desktop."); }
}
class H8_Phone extends H8_Device {
    H8_Phone(String brand) { super(brand); }
    @Override void turnOn() { System.out.println(brand + " phone turning on."); }
    void display() { System.out.println(brand + " phone showing home screen."); }
}

// ----- H9: Animal -> Mammal -> Dog (constructor chaining) -----
class H9_Animal {
    H9_Animal() { System.out.println("1. Animal constructor called."); }
}
class H9_Mammal extends H9_Animal {
    H9_Mammal() { System.out.println("2. Mammal constructor called."); }
}
class H9_Dog extends H9_Mammal {
    H9_Dog() { System.out.println("3. Dog constructor called."); }
}

// ----- H10: Shape array polymorphism (Circle, Square, Triangle) -----
class H10_Shape {
    double area() { return 0; }
    String name() { return "Shape"; }
}
class H10_Circle extends H10_Shape {
    double r;
    H10_Circle(double r) { this.r = r; }
    @Override double area() { return Math.PI * r * r; }
    @Override String name() { return "Circle"; }
}
class H10_Square extends H10_Shape {
    double s;
    H10_Square(double s) { this.s = s; }
    @Override double area() { return s * s; }
    @Override String name() { return "Square"; }
}
class H10_Triangle extends H10_Shape {
    double b, h;
    H10_Triangle(double b, double h) { this.b = b; this.h = h; }
    @Override double area() { return 0.5 * b * h; }
    @Override String name() { return "Triangle"; }
}

// ----- H11: Employee -> Manager (bonus) -> Director (stock options) -----
class H11_Employee {
    double salary;
    H11_Employee(double salary) { this.salary = salary; }
    double totalCompensation() { return salary; }
}
class H11_Manager extends H11_Employee {
    double bonus;
    H11_Manager(double salary, double bonus) { super(salary); this.bonus = bonus; }
    @Override double totalCompensation() { return salary + bonus; }
}
class H11_Director extends H11_Manager {
    double stockOptions;
    H11_Director(double salary, double bonus, double stockOptions) {
        super(salary, bonus); this.stockOptions = stockOptions;
    }
    @Override double totalCompensation() { return salary + bonus + stockOptions; }
}

// ----- H12: wk13.Vehicle -> wk13.Car -> SportsCar (override start/stop) -----
class H12_Vehicle {
    void start() { System.out.println("wk13.Vehicle: starting engine."); }
    void stop()  { System.out.println("wk13.Vehicle: stopping engine."); }
}
class H12_Car extends H12_Vehicle {
    @Override void start() { System.out.println("wk13.Car: turning ignition key."); }
    @Override void stop()  { System.out.println("wk13.Car: applying brakes."); }
}
class H12_SportsCar extends H12_Car {
    @Override void start() { System.out.println("SportsCar: ROAR! Engine starts."); }
    @Override void stop()  { System.out.println("SportsCar: Emergency stop!"); }
}

// ----- H13: Person -> Student -> InternationalStudent (all constructors + details) -----
class H13_Person {
    String name;
    H13_Person(String name) {
        this.name = name;
        System.out.println("H13 Person constructor.");
    }
    void printDetails() { System.out.println("Name: " + name); }
}
class H13_Student extends H13_Person {
    String university;
    H13_Student(String name, String university) {
        super(name);
        this.university = university;
        System.out.println("H13 Student constructor.");
    }
    @Override void printDetails() { super.printDetails(); System.out.println("Uni: " + university); }
}
class H13_InternationalStudent extends H13_Student {
    String country;
    H13_InternationalStudent(String name, String university, String country) {
        super(name, university);
        this.country = country;
        System.out.println("H13 InternationalStudent constructor.");
    }
    @Override void printDetails() { super.printDetails(); System.out.println("Country: " + country); }
}

// ----- H14: Book -> Textbook, Novel, Magazine (override displayInfo) -----
class H14_Book {
    String title, author;
    H14_Book(String title, String author) { this.title = title; this.author = author; }
    void displayInfo() { System.out.println("Book: " + title + " by " + author); }
}
class H14_Textbook extends H14_Book {
    String subject;
    H14_Textbook(String title, String author, String subject) {
        super(title, author); this.subject = subject;
    }
    @Override void displayInfo() {
        super.displayInfo();
        System.out.println("  Subject: " + subject);
    }
}
class H14_Novel extends H14_Book {
    String genre;
    H14_Novel(String title, String author, String genre) {
        super(title, author); this.genre = genre;
    }
    @Override void displayInfo() {
        super.displayInfo();
        System.out.println("  Genre: " + genre);
    }
}
class H14_Magazine extends H14_Book {
    int issueNumber;
    H14_Magazine(String title, String author, int issueNumber) {
        super(title, author); this.issueNumber = issueNumber;
    }
    @Override void displayInfo() {
        super.displayInfo();
        System.out.println("  Issue: #" + issueNumber);
    }
}

// ----- H15: BankAccount -> SavingsAccount, CurrentAccount (polymorphism) -----
class H15_BankAccount {
    double balance;
    H15_BankAccount(double balance) { this.balance = balance; }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) { balance -= amount; System.out.println("Withdrawn: " + amount); }
        else System.out.println("Insufficient funds.");
    }
}
class H15_SavingsAccount extends H15_BankAccount {
    H15_SavingsAccount(double balance) { super(balance); }
    @Override void deposit(double amount) {
        balance += amount * 1.03;
        System.out.println("Savings deposit (+3% interest) | Balance: " + balance);
    }
}
class H15_CurrentAccount extends H15_BankAccount {
    double overdraft;
    H15_CurrentAccount(double balance, double overdraft) {
        super(balance); this.overdraft = overdraft;
    }
    @Override void withdraw(double amount) {
        if (amount <= balance + overdraft) { balance -= amount; System.out.println("Current withdrawn: " + amount); }
        else System.out.println("Exceeds overdraft limit.");
    }
}

// ----- H16: Shape array (Circle, Square, Triangle) - call area() via polymorphism -----
// (Reuses H10 classes — demonstrated in main below)

// ----- H17: Person -> Employee -> Manager -> Director (displayDetails) -----
class H17_Person {
    String name;
    H17_Person(String name) { this.name = name; }
    void displayDetails() { System.out.println("Person: " + name); }
}
class H17_Employee extends H17_Person {
    double salary;
    H17_Employee(String name, double salary) { super(name); this.salary = salary; }
    @Override void displayDetails() { super.displayDetails(); System.out.println("  Salary: " + salary); }
}
class H17_Manager extends H17_Employee {
    String department;
    H17_Manager(String name, double salary, String department) {
        super(name, salary); this.department = department;
    }
    @Override void displayDetails() { super.displayDetails(); System.out.println("  Dept: " + department); }
}
class H17_Director extends H17_Manager {
    String region;
    H17_Director(String name, double salary, String department, String region) {
        super(name, salary, department); this.region = region;
    }
    @Override void displayDetails() { super.displayDetails(); System.out.println("  Region: " + region); }
}

// ----- H18: wk13.Vehicle -> wk13.Car, Bike, Truck (override rent) -----
class H18_Vehicle {
    void rent() { System.out.println("Renting a vehicle."); }
}
class H18_Car extends H18_Vehicle {
    @Override void rent() { System.out.println("Renting a wk13.Car: $50/day."); }
}
class H18_Bike extends H18_Vehicle {
    @Override void rent() { System.out.println("Renting a Bike: $15/day."); }
}
class H18_Truck extends H18_Vehicle {
    @Override void rent() { System.out.println("Renting a Truck: $120/day."); }
}

// ----- H19: Animal -> Mammal -> Dog (overriding, constructor chaining, super) -----
class H19_Animal {
    String species;
    H19_Animal(String species) {
        this.species = species;
        System.out.println("H19 Animal created: " + species);
    }
    void sound() { System.out.println("Some sound."); }
}
class H19_Mammal extends H19_Animal {
    boolean hasFur;
    H19_Mammal(String species, boolean hasFur) {
        super(species);
        this.hasFur = hasFur;
        System.out.println("H19 Mammal created, hasFur=" + hasFur);
    }
    @Override void sound() { System.out.println("Mammal sound."); }
}
class H19_Dog extends H19_Mammal {
    String name;
    H19_Dog(String name) {
        super("Canis lupus familiaris", true);
        this.name = name;
        System.out.println("H19 Dog created: " + name);
    }
    @Override void sound() {
        super.sound();
        System.out.println(name + " says: Woof!");
    }
}

// ----- H20: Shape -> Polygon -> Triangle (perimeter + area, polymorphism) -----
class H20_Shape {
    double area() { return 0; }
}
class H20_Polygon extends H20_Shape {
    int sides;
    H20_Polygon(int sides) { this.sides = sides; }
    double perimeter() { return 0; }
}
class H20_Triangle extends H20_Polygon {
    double a, b, c;
    H20_Triangle(double a, double b, double c) {
        super(3);
        this.a = a; this.b = b; this.c = c;
    }
    @Override double perimeter() { return a + b + c; }
    @Override double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }
}

// ============================================================
// MAIN - run all hard exercises
// ============================================================
public class Hard_Inheritance {
    public static void main(String[] args) {
        System.out.println("=== H1: Employee Bonus ===");
        H1_Manager mgr = new H1_Manager("Alice", 1, 80000);
        H1_Developer dev = new H1_Developer("Bob", 2, 70000);
        System.out.println(mgr.name + " bonus: " + mgr.calculateBonus());
        System.out.println(dev.name + " bonus: " + dev.calculateBonus());

        System.out.println("\n=== H2: CollegeStudent Constructors ===");
        H2_CollegeStudent cs = new H2_CollegeStudent("Sara", 999, "Computer Science");
        cs.display();

        System.out.println("\n=== H3: ElectricCar Attributes ===");
        new H3_ElectricCar(120, "Electric", 4, 85).display();

        System.out.println("\n=== H4: Shape Areas ===");
        H4_Shape[] shapes4 = {
            new H4_Circle("Red", 5),
            new H4_Rectangle("Blue", 4, 6),
            new H4_Triangle("Green", 3, 8)
        };
        for (H4_Shape s : shapes4)
            System.out.printf("Color=%s, Area=%.2f%n", s.color, s.area());

        System.out.println("\n=== H5: BankAccount Polymorphism ===");
        new H5_SavingsAccount(500).deposit(200);
        H5_CheckingAccount ca = new H5_CheckingAccount(100);
        ca.withdraw(550);

        System.out.println("\n=== H6: super vs this ===");
        new H6_Student().display();

        System.out.println("\n=== H7: Employee Hierarchy work() ===");
        new H7_Employee().work();
        new H7_Manager().work();
        new H7_SeniorManager().work();

        System.out.println("\n=== H8: Device subclasses ===");
        H8_Laptop lp = new H8_Laptop("Dell");
        lp.turnOn(); lp.display();
        H8_Phone ph = new H8_Phone("Apple");
        ph.turnOn(); ph.display();

        System.out.println("\n=== H9: Constructor Chaining Animal->Mammal->Dog ===");
        new H9_Dog();

        System.out.println("\n=== H10: Shape Array Polymorphism ===");
        H10_Shape[] shapes10 = {
            new H10_Circle(7),
            new H10_Square(5),
            new H10_Triangle(4, 9)
        };
        for (H10_Shape s : shapes10)
            System.out.printf("%s area = %.2f%n", s.name(), s.area());

        System.out.println("\n=== H11: Total Compensation ===");
        H11_Employee e = new H11_Employee(50000);
        H11_Manager m = new H11_Manager(80000, 15000);
        H11_Director d = new H11_Director(120000, 30000, 50000);
        System.out.println("Employee: " + e.totalCompensation());
        System.out.println("Manager:  " + m.totalCompensation());
        System.out.println("Director: " + d.totalCompensation());

        System.out.println("\n=== H12: wk13.Vehicle -> wk13.Car -> SportsCar ===");
        H12_SportsCar sc = new H12_SportsCar();
        sc.start(); sc.stop();

        System.out.println("\n=== H13: InternationalStudent Constructors ===");
        H13_InternationalStudent is = new H13_InternationalStudent("Mei", "UofT", "China");
        is.printDetails();

        System.out.println("\n=== H14: Library System ===");
        H14_Book[] books = {
            new H14_Textbook("Java 101", "Author A", "CS"),
            new H14_Novel("1984", "Orwell", "Dystopian"),
            new H14_Magazine("Time", "Staff", 42)
        };
        for (H14_Book b : books) b.displayInfo();

        System.out.println("\n=== H15: BankAccount Polymorphism (deposit/withdraw) ===");
        H15_BankAccount[] accounts = {
            new H15_SavingsAccount(1000),
            new H15_CurrentAccount(500, 300)
        };
        accounts[0].deposit(200);
        accounts[1].withdraw(700);

        System.out.println("\n=== H16: Shape Array (same as H10) ===");
        H10_Shape[] arr = { new H10_Circle(3), new H10_Square(4), new H10_Triangle(6, 5) };
        for (H10_Shape s : arr)
            System.out.printf("%s area = %.2f%n", s.name(), s.area());

        System.out.println("\n=== H17: Person->Employee->Manager->Director displayDetails ===");
        new H17_Director("James", 150000, "Engineering", "North America").displayDetails();

        System.out.println("\n=== H18: wk13.Vehicle Rental System ===");
        H18_Vehicle[] rentals = { new H18_Car(), new H18_Bike(), new H18_Truck() };
        for (H18_Vehicle v : rentals) v.rent();

        System.out.println("\n=== H19: Animal->Mammal->Dog (super + override) ===");
        H19_Dog dog = new H19_Dog("Rex");
        dog.sound();

        System.out.println("\n=== H20: Triangle Perimeter & Area ===");
        H20_Triangle tri = new H20_Triangle(3, 4, 5);
        System.out.printf("Perimeter: %.2f%n", tri.perimeter());
        System.out.printf("Area: %.2f%n", tri.area());
    }
}
