package TestingQuestions;

// Question 3.2 - Double to int conversion
public class Question3_2 {
    public static void main(String[] args) {
        double doubleValue = 5.75;
        int intValue = (int) doubleValue; // Casting - decimal part is lost
        
        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value: " + intValue);
    }
}
