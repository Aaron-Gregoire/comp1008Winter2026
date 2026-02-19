package TestingQuestions;

import java.util.Scanner;

// Question 1.2 - Multiply two integers
public class Question1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        int product = num1 * num2;
        System.out.println("The product is: " + product);
        
        scanner.close();
    }
}
