package CalculatorTest;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTests {
    Calculator calculator;

    @BeforeClass
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void  additionOfPositiveIntNumbersTest(){
        int a = 1;
        int b = 3;
        int expected = 4;
        int actual = calculator.add(a,b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void  additionOfNegativeIntNumbersTest(){
        int a = -1;
        int b = -3;
        int expected = -4;
        int actual = calculator.add(a,b);
        Assert.assertEquals(actual, expected);
    }
    @Test(dataProvider = "testData")
    public void additionOfIntNumber(int a, int b, int expected) {
        int actual = calculator.add(a,b);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name="testData")
    public Object[][] testData (){
        return new Object[][] {
                {1,2,3},
                {-1,-2,-3},
                {-1,2,1},
                {0,0,0}
        };
    }
}
