package TestingQuestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// JUnit tests for Person
public class PersonTest {
    

    public void ConstructorAndGetters() {
        Person person = new Person("Alice", 25);
        assertEquals("Alice", person.getName());
        assertEquals(25, person.getAge());
    }
    

    public void GetName() {
        Person person = new Person("Bob", 30);
        assertEquals("Bob", person.getName());
    }
    

    public void GetAge() {
        Person person = new Person("Charlie", 35);
        assertEquals(35, person.getAge());
    }
}
