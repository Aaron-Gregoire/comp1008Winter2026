package TestingQuestions;

import java.util.Scanner;

// Question 9.5 - Date validation (DD/MM/YYYY)
public class Question9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        
        if (date.matches(regex)) {
            System.out.println("Valid date format");
        } else {
            System.out.println("Invalid date format");
        }
        
        scanner.close();
    }
}
