package TestingQuestions;

import java.util.Scanner;

// Question 9.2 - Username validation (5-10 chars, letters/numbers/_)
public class Question9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        String regex = "[a-zA-Z0-9_]{5,10}";
        
        if (username.matches(regex)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
        
        scanner.close();
    }
}
