package wk4;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

 public class StudentTest {

   @Test
   public void testDefaultConstructor(){

       Student s = new Student();
       //dob = jan 1
       //name is null
       // age = 0
       //gpa = 0

       assertEquals(s.dob, "jan 1");
       assertNull(s.name);
       assertNotNull(s.dob);
       assertTrue(s.age == 0);
       assertFalse(s.gpa < 0);

   }

     @Test
     public void testOneArgConstructor(){
         String dob = "feb 1";
         Student s = new Student(dob);
         //dob = jan 1
         //name is null
         // age = 0
         //gpa = 0

         assertEquals(s.dob, dob);
         assertNull(s.name);
         assertNotNull(s.dob);



     }

     @ParameterizedTest
     @ValueSource(ints = {20 ,25 ,30})
     public void testStudentAge(int age){
       Student s = new Student();
       s.age = age;
       assertEquals(age, s.age);
     }

     @ParameterizedTest
     @ValueSource(strings = {"ben", "joe", "bob"})
     public void testStudentName(String name){
         Student s = new Student();
         s.name = name;
         assertEquals(name, s.name);
     }

     @ParameterizedTest
     @CsvSource({"ben, mar 1, 30, 3.5", "jen, apr 1, 31, 3.6", "rob, oct 1, 30, 3.7"})
     public void testFourArgConstructor(String name, String dob, int age, double gpa){

       Student s = new Student(name, dob, age, gpa);
       assertEquals(name, s.name);
       assertEquals(dob, s.dob);
       assertEquals(age, s.age);
       assertEquals(gpa, s.gpa);
     }
}