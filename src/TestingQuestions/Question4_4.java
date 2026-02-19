package TestingQuestions;

// Question 4.4 - Find longest name
public class Question4_4 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Christopher", "Bob", "Elizabeth", "Dan"};
        
        String longestName = names[0];
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        System.out.println("The longest name is: " + longestName);
    }
}
