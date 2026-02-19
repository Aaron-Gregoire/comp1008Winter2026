package TestingQuestions;

// Calculator class for testing
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int getLength(String text) {
        return text.length();
    }
    
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
