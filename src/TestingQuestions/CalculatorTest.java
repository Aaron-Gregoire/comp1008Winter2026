package TestingQuestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// JUnit tests for Calculator
public class CalculatorTest {
    

    public void Add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
    }
    

    public void GetLength() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.getLength("Hello"));
        assertEquals(0, calc.getLength(""));
    }
    

    public void IsEven() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(7));
    }
    

    public void Divide() {
        Calculator calc = new Calculator();
        assertEquals(2.5, calc.divide(5, 2), 0.001);
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
    }
}
