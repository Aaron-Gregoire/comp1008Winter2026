package TestingQuestions;

// Question 10.5 - StringBuilder replace
public class Question10_5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like cats");
        
        sb.replace(7, 11, "dogs"); // Replace "cats" with "dogs"
        
        System.out.println(sb.toString());
    }
}
