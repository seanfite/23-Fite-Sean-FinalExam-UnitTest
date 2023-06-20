import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringCalculatorTest {

    public StringCalculator stringCalc;


    // base case test 1
    @Test
    public void test1() {
        int total = stringCalc.add("5, 6");
        assertEquals(11, total);
    }

    // test to ignore if entered value is more than 10000
    @Test
    public void test2() {
        int total = stringCalc.add("10004, 6");
        assertEquals(6, total);
    }

    // test to throw exception for negative number input
    @Test
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringCalc.add("-10, 5");
        });
    }
}


