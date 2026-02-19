package TestingQuestions;

// Question 10.1 - StringBuilder append
public class Question10_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("John");
        sb.append(" ");
        sb.append("Smith");
        
        System.out.println(sb.toString());
    }
}
