package TestingQuestions;

import java.util.Scanner;

// Question 8.3 - Car rental eligibility
public class Question8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Do you have a driver's license? (true/false): ");
        boolean hasLicense = scanner.nextBoolean();
        
        if (age >= 21 && hasLicense) {
            System.out.println("You are eligible to rent a car");
        } else {
            System.out.println("Not eligible");
        }
        
        scanner.close();
    }
}
