package TestingQuestions;

// Question 10.4 - StringBuilder delete
public class Question10_4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");
        
        sb.delete(5, 10); // Removes "World"
        
        System.out.println(sb.toString());
    }
}
