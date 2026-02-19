package TestingQuestions;

import java.util.Scanner;

// Question 7.4 - Do-while loop until 0
public class Question7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        
        System.out.println("Enter numbers (enter 0 to stop):");
        
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        
        System.out.println("Total sum: " + sum);
        
        scanner.close();
    }
}
