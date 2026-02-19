package TestingQuestions;

// Question 5.1 - Overloaded multiply methods
public class Question5_1 {
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public static void main(String[] args) {
        System.out.println("Multiply two numbers (5 * 3): " + multiply(5, 3));
        System.out.println("Multiply three numbers (2 * 4 * 3): " + multiply(2, 4, 3));
    }
}
