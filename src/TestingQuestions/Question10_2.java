package TestingQuestions;

import java.util.Scanner;

// Question 10.2 - StringBuilder reverse
public class Question10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        
        System.out.println("Reversed word: " + sb.toString());
        
        scanner.close();
    }
}
