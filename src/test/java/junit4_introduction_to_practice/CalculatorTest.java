package junit4_introduction_to_practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testdivide_第２引数に0を指定すると例外が発生する() {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Calculator calculator = new Calculator();
                    assertEquals(3, calculator.divide(1, 0));
                }
        );
    }
}