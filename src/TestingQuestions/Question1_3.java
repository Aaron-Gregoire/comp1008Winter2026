package TestingQuestions;

import java.util.Scanner;

// Question 1.3 - Calculate square of decimal number
public class Question1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();
        
        double square = number * number;
        System.out.println("The square of " + number + " is: " + square);
        
        scanner.close();
    }
}
