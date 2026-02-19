package TestingQuestions;

// Question 10.3 - StringBuilder insert
public class Question10_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        
        sb.insert(0, "Programming ");
        
        System.out.println(sb.toString());
    }
}
