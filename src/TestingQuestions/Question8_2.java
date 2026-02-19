package TestingQuestions;

import java.util.Scanner;

// Question 8.2 - Grade calculator
public class Question8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your test mark (0-100): ");
        int mark = scanner.nextInt();
        
        if (mark >= 75 && mark <= 100) {
            System.out.println("Distinction");
        } else if (mark >= 50 && mark <= 74) {
            System.out.println("Pass");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid mark");
        }
        
        scanner.close();
    }
}
