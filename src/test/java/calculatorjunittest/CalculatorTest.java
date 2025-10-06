package calculatorjunittest;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void addTest(){
        calculator = new Calculator();
        calculator.add(20,5);
        int expectedResult = 25;
        Assert.assertEquals(expectedResult, calculator.getResult());
    }

    @Test
    public void subTest(){
        calculator = new Calculator();
        calculator.add(20,5);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult, calculator.getResult());
    }

    @Test
    public void multTest(){
        calculator = new Calculator();
        calculator.add(20,5);
        int expectedResult = 100;
        Assert.assertEquals(expectedResult, calculator.getResult());
    }

    @Test
    public void divTest(){
        calculator = new Calculator();
        calculator.add(20,5);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, calculator.getResult());
    }

}
