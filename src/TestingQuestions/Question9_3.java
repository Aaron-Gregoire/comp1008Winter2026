package TestingQuestions;

import java.util.Scanner;

// Question 9.3 - Name validation (Capital + lowercase)
public class Question9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        String regex = "[A-Z][a-z]+";
        
        if (name.matches(regex)) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }
        
        scanner.close();
    }
}
