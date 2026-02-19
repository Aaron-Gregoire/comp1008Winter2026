package TestingQuestions;

// Question 6.5 - Employee array with average salary
enum Department {
    IT, HR, SALES, MARKETING, FINANCE
}

class Employee {
    private String name;
    private double salary;
    private Department department;
    
    public Employee(String name, double salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public Department getDepartment() { return department; }
}

public class Question6_5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Alice", 75000, Department.IT);
        employees[1] = new Employee("Bob", 65000, Department.HR);
        employees[2] = new Employee("Charlie", 80000, Department.SALES);
        employees[3] = new Employee("Diana", 70000, Department.MARKETING);
        
        System.out.println("Employee Details:");
        double totalSalary = 0;
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getDepartment() + " - $" + emp.getSalary());
            totalSalary += emp.getSalary();
        }
        
        double averageSalary = totalSalary / employees.length;
        System.out.println("\nAverage Salary: $" + averageSalary);
    }
}
