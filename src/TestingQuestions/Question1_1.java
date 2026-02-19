package TestingQuestions;

import java.util.Scanner;

// Question 1.1 - Read and display full name
public class Question1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        System.out.println("Your full name is: " + fullName);
        
        scanner.close();
    }
}
