package TestingQuestions;

import java.util.Scanner;

// Question 1.5 - Display personal information
public class Question1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();
        
        System.out.println("\n=== Your Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " cm");
        
        scanner.close();
    }
}
