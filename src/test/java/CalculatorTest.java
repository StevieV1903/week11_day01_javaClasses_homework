import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void can_add(){
        assertEquals(10, calculator.addingNumbers(6, 4));
    }

    @Test
    public void can_subtract() {
        assertEquals(9, calculator.subtractingNumbers(14, 5));
    }

    @Test
    public void can_multiply() {
        assertEquals(21, calculator.multiplyingNumbers(7, 3));
    }

    @Test
    public void can_divide() {
        assertEquals(2.5, calculator.dividingNumbers(5.0, 2.0), 0.01);
    }







}
