package TestingQuestions;

// Question 7.5 - Enhanced for loop and average
public class Question7_5 {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 18, 30, 15};
        
        System.out.println("Array elements:");
        int sum = 0;
        for (int num : numbers) {
            System.out.println(num);
            sum += num;
        }
        
        double average = (double) sum / numbers.length;
        System.out.println("\nAverage: " + average);
    }
}
