package wk3;

public class Company {
     private int numEmployees ;
     private Employee[] employees;

     public Company(int maxEmployees){
         if(maxEmployees <= 0){
             maxEmployees = 10;
         }
         this.employees = new Employee[maxEmployees];
         this.numEmployees = 0;
     }

     public void addEmployee(Employee emp){
         if(numEmployees < employees.length){
             employees[numEmployees] = emp;
             numEmployees++;
         }
     }

     public int getNumEmployees(){
             return numEmployees;
         }
         public double getLowestSalary(){
             if(numEmployees == 0){
                 return -1;
             }


         double lowest = employees[0].getSalary();

         for(int i = 1; i < numEmployees; i++){
             if (employees[i].getSalary() < lowest) {
                 lowest = employees[i].getSalary();
             }
         }
         return lowest;
     }
     public double getHighestSalary(){
         if(numEmployees == 0){
             return -1;
         }
         double highest = employees[0].getSalary();

         for(int i = 1; i < numEmployees; i++){
             if(employees[i].getSalary() > highest){
                 highest = employees[i].getSalary();
             }
         }
         return highest;
     }


}