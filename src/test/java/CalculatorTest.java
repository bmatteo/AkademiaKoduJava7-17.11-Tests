import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void generateCalculator() {
        CalculatorTest.calculator = new Calculator();
    }

    @Before
    public void doSomething() {
        System.out.println("dupa");
    }

    @Test
    public void testSum() {
        int a = 5;
        int b = 3;
        int expectedResult = 8;

        Assert.assertEquals(expectedResult, CalculatorTest.calculator.sum(a,b));
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 3;
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, CalculatorTest.calculator.subtract(a,b));
    }

    @Test
    public void testDivideWhenBIsZero() {
        int a = 5;
        int b = 0;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, CalculatorTest.calculator.divide(a,b));
    }

    @Test
    public void testDivide() {
        int a = 10;
        int b = 2;
        int expectedResult = 5;

        Assert.assertEquals(expectedResult, CalculatorTest.calculator.divide(a,b));
    }
}
