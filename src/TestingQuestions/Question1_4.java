package TestingQuestions;

import java.util.Scanner;

// Question 1.4 - Read three words and display with commas
public class Question1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();
        
        System.out.print("Enter third word: ");
        String word3 = scanner.nextLine();
        
        System.out.println(word1 + ", " + word2 + ", " + word3);
        
        scanner.close();
    }
}
