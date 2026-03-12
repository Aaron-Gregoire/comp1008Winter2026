package exam;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Employee {
    private double salary;
    private String employeeId;
    private int[] preformanceScores;
    private int position;

        public Employee(String employeeId, double salary, int position, int[] preformanceScores){
            String regex = "^EMP\\d{4}$";
            if (employeeId.matches(regex)){
            this.employeeId = employeeId;
            }else{
                System.err.println("invalid employee id");
            }
            this.salary = salary;
            this.position = position;
        }

        public double intern() {
            if (position == 1) {
                salary = 100000;
            }
            return salary;
        }
        public double manager(){
            if(position == 0){
                salary = 200000;
            }
            return salary;
        }

  /*  Create a class Employee representing a company employee.

    It must have:

    double salary (positive)
    String employeeId (regex: ^EMP\d{4}$)
    int[] performanceScores
    Requirements:


    Constructors (at least 2)
    static factories intern(), manager() that set appropriate salaries
    Getters/setters with validation
    Exceptions for invalid data
    Unit tests (1 regular test, 1 parameter test for salary and employeeId, totaling 4 tests) */
}
