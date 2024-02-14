import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest {

    @Test
    public void testAdd() {
        assertEquals(5.0, Calc.add(2.0, 3.0), 0.0001);
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, Calc.subtract(5.0, 3.0), 0.0001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Calc.multiply(2.0, 3.0), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calc.divide(5.0, 2.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calc.divide(5.0, 0.0);
    }



    @Test
    public void testLogarithm() {
        assertEquals(2.0, Calc.logarithm(100.0, 10.0), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calc.squareRoot(16.0), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calc.power(2.0, 3.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calc.factorial(5));
    }
}
