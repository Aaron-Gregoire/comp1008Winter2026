package TestingQuestions;

import java.util.Scanner;

// Question 3.3 - Calculate average from String inputs
public class Question3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        String num1String = scanner.nextLine();
        
        System.out.print("Enter second number: ");
        String num2String = scanner.nextLine();
        
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        
        double average = (num1 + num2) / 2;
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
