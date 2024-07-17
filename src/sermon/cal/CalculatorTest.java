package sermon.cal;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int a = 1;
        int b = 1;
        Calculator instance = new Calculator();
        int exResult = 2;
        int result = instance.add(a, b);
        assertEquals(exResult, result);
    }

    @Test
    public void testAdd2() {
        int a = Integer.MAX_VALUE;
        int b = 1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(a, b);
            assertFalse(true);
        }catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAdd3() {
        int a = Integer.MIN_VALUE;
        int b = -1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(a, b);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }


}
