package wk10;

public class Student {
    int studentID;
    String name;
    int age;

    public Student(){}

    public Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    public String greet(){
        return "Hello, my name is " + this.name;
    }
}
