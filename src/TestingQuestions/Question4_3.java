package TestingQuestions;

// Question 4.3 - Array average
public class Question4_3 {
    public static void main(String[] args) {
        double[] values = {4.5, 8.2, 3.7, 9.1, 6.3};
        
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        
        double average = sum / values.length;
        System.out.println("Average: " + average);
    }
}
