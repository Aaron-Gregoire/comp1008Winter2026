package wk13.assignment3;

public class Manager extends Employee{
    public String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
