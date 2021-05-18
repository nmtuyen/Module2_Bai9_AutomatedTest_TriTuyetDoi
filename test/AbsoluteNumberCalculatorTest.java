import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result, expected);
    }

    @Test
    void testFindAbsolute2() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(result, expected);

    }


}