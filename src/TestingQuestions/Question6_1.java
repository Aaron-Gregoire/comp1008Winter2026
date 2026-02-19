package TestingQuestions;

// Question 6.1 - Car class with getters and setters
class Car {
    private String brand;
    private int year;
    
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
}

public class Question6_1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        
        System.out.println("Car Details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        
        car.setBrand("Honda");
        car.setYear(2023);
        
        System.out.println("\nUpdated Car Details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
    }
}
