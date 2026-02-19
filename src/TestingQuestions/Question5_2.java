package TestingQuestions;

// Question 5.2 - Overloaded display methods
public class Question5_2 {
    
    public static void display(String text) {
        System.out.println("String: " + text);
    }
    
    public static void display(int number) {
        System.out.println("Integer: " + number);
    }
    
    public static void display(double number) {
        System.out.println("Double: " + number);
    }
    
    public static void main(String[] args) {
        display("Hello World");
        display(42);
        display(3.14159);
    }
}
