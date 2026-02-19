package TestingQuestions;

// Question 6.3 - Course class with enum
enum Level {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED
}

class Course {
    private String courseName;
    private Level level;
    
    public Course(String courseName, Level level) {
        this.courseName = courseName;
        this.level = level;
    }
    
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public Level getLevel() { return level; }
    public void setLevel(Level level) { this.level = level; }
}

public class Question6_3 {
    public static void main(String[] args) {
        Course course1 = new Course("Introduction to Java", Level.BEGINNER);
        Course course2 = new Course("Advanced Data Structures", Level.ADVANCED);
        Course course3 = new Course("Object-Oriented Programming", Level.INTERMEDIATE);
        
        System.out.println("Course 1: " + course1.getCourseName() + " - " + course1.getLevel());
        System.out.println("Course 2: " + course2.getCourseName() + " - " + course2.getLevel());
        System.out.println("Course 3: " + course3.getCourseName() + " - " + course3.getLevel());
    }
}
