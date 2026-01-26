package wk3;

public class Week3 {

    public static void main(String[] args) {
  //      EventTicketingSystem ts = new EventTicketingSystem("Lemonade Stand", 5, 200);
  //      ts.buyTickets(5);
  //      ts.refundTickets(2);
 //       ts.buyTickets(20);
//      System.out.println(ts.getRevenueGenerated());

//        Course comp1008 = new Course("Intro to OOP", "comp1008", 6);
//        comp1008.addEvaluation("Assignment 1", 90);
//        comp1008.addEvaluation("Assignment 2", 80);
//        Object[] values = comp1008.getEvaluation(0);
//
//        for(Object o : values) {
//            System.out.println(o);
//        }

      // Classroom classroom = new Classroom("K320", 20);
      // classroom.addStudent(new Student(12345, "John Smith", 90));
       //classroom.addStudent(new Student(98765, "Mary Johnson", 100));
     //  System.out.println(classroom.getClassAverage());

   //    Company c = new Company(4);
   //    c.addEmployee(new Employee(1001, "john", 20000));
  //     c.addEmployee(new Employee(1002, "jim", 50000));
  //     c.addEmployee(new Employee(1001, "joe", 100000));
  //     c.addEmployee(new Employee(1001, "bobby", 23232323));
  //      System.out.println(c.getNumEmployees());
 //       System.out.println(c.getLowestSalary());
 //       System.out.println(c.getHighestSalary());
        Store store = new Store(5);

        store.addProduct(new Product(101, "Laptop", 1299.99));
        store.addProduct(new Product(102, "Mouse", 24.99));
        store.addProduct(new Product(103, "Keyboard", 89.50));
        System.out.println("Number of products: " + store.getNumberOfProducts());
        System.out.printf("Total value: $%.2f%n", store.getTotalValueOfProducts());
    }
}
