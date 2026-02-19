package TestingQuestions;

import java.util.Scanner;

// Question 12.3 - Array index out of bounds
public class Question12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        
        try {
            System.out.print("Enter an index (0-4): ");
            int index = scanner.nextInt();
            
            System.out.println("Value at index " + index + ": " + numbers[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        
        scanner.close();
    }
}
