package TestingQuestions;

import java.util.Scanner;

// Question 3.5 - Character to float (ASCII value)
public class Question3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        String charString = scanner.nextLine();
        
        char character = charString.charAt(0);
        float floatValue = (float) character; // Gets ASCII value
        
        System.out.println("Character: " + character);
        System.out.println("Float value (ASCII): " + floatValue);
        
        scanner.close();
    }
}
