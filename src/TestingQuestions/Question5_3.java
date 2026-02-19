package TestingQuestions;

// Question 5.3 - Overloaded area methods
public class Question5_3 {
    
    // Area of square
    public static double area(double side) {
        return side * side;
    }
    
    // Area of rectangle
    public static double area(double length, double width) {
        return length * width;
    }
    
    public static void main(String[] args) {
        System.out.println("Area of square (side 5): " + area(5));
        System.out.println("Area of rectangle (4 x 7): " + area(4, 7));
    }
}
