package TestingQuestions;

import java.util.Scanner;

// Question 9.4 - Product code validation (ABC-123)
public class Question9_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter product code: ");
        String productCode = scanner.nextLine();
        
        String regex = "[A-Z]{3}-\\d{3}";
        
        if (productCode.matches(regex)) {
            System.out.println("Valid product code");
        } else {
            System.out.println("Invalid product code");
        }
        
        scanner.close();
    }
}
