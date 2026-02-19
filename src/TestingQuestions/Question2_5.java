package TestingQuestions;

// Question 2.5 - Difference between print() and println()
public class Question2_5 {
    public static void main(String[] args) {
        System.out.println("Using println():");
        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
        
        System.out.println("\nUsing print():");
        System.out.print("First ");
        System.out.print("Second ");
        System.out.print("Third ");
        System.out.println();
        
        System.out.println("\nDifference: println() adds a new line, print() does not.");
    }
}
