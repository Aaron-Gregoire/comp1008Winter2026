package TestingQuestions;

// Question 6.2 - Student array
class Student {
    private String name;
    private double grade;
    
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }
}

public class Question6_2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 85.5);
        students[1] = new Student("Bob", 92.0);
        students[2] = new Student("Charlie", 78.3);
        
        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Grade: " + students[i].getGrade());
        }
    }
}
