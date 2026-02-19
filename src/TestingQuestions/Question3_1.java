package TestingQuestions;

import java.util.Scanner;

// Question 3.1 - String to int conversion
public class Question3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        String ageString = scanner.nextLine();
        
        int age = Integer.parseInt(ageString);
        int nextYearAge = age + 1;
        
        System.out.println("Next year you will be: " + nextYearAge);
        
        scanner.close();
    }
}
