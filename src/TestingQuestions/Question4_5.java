package TestingQuestions;

// Question 4.5 - Count even numbers
public class Question4_5 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 8, 15, 22, 9, 14, 31, 6};
        
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if even
                evenCount++;
            }
        }
        
        System.out.println("Number of even numbers: " + evenCount);
    }
}
