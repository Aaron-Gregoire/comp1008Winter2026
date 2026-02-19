package TestingQuestions;

// Question 5.4 - Overloaded convert methods
public class Question5_4 {
    
    // Int to double
    public static double convert(int number) {
        return (double) number;
    }
    
    // Double to int
    public static int convert(double number) {
        return (int) number;
    }
    
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        
        System.out.println("Convert int " + intValue + " to double: " + convert(intValue));
        System.out.println("Convert double " + doubleValue + " to int: " + convert(doubleValue));
    }
}
