package TestingQuestions;

import java.util.Scanner;

// Question 9.1 - Student number validation (ST + 4 digits)
public class Question9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student number: ");
        String studentNumber = scanner.nextLine();
        
        String regex = "ST\\d{4}";
        
        if (studentNumber.matches(regex)) {
            System.out.println("Valid student number");
        } else {
            System.out.println("Invalid student number");
        }
        
        scanner.close();
    }
}
