package CalculatorTestHW;


import CalculatorHW.CalculatorHW;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.print.attribute.standard.JobKOctets;

public class CalculatorTestHW {
    CalculatorHW calculator;

    @BeforeClass
    public void setUp() {
        calculator = new CalculatorHW();
    }

    @Test(dataProvider = "testDataAdd")
    public void sum(int a, int b, int expected){
        int actual = calculator.add(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "testDataMinus")
    public void minus(int a, int b, int expected){
        int actual = calculator.minus(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "testDataDevide")
    public void devide(double a, double b, double expected){
        double actual = calculator.devide(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "testDataMultiply")
    public void  multiply(int a, int b, int expected){
        int actual = calculator.multiply(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "testDataSqr")
    public void sqr(double a, double expected) {
        double actual = calculator.sqr(a);
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "testDataSqrt")
    public void sqrt(double a, double expected) {
        double actual = calculator.sqrt(a);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "testDataRound")
    public void round(double a, double expected) {
        double actual = calculator.round(a);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name="testDataAdd")
    public Object [][] testDataAdd() {
            return new Object[][] {
            {10,2,12},
            {-11,-2,-13},
            {-11,2,-9},
        };
    }
    @DataProvider(name="testDataMinus")
    public Object [][] testDataMinus() {
        return new Object[][] {
                {10,2,8},
                {-11,-2,-9},
                {-11,2,-13},
        };
    }

    @DataProvider(name="testDataDevide")
    public Object [][] testDataDevide() {
        return new Object[][] {
                {10,2,5},
                {-15,-3,5},
                {-11.0,2.0,-5.5},
        };
    }

    @DataProvider(name = "testDataMultiply")
    public Object [][] testDataMultiply() {
        return new Object[][]{
                {2,10,20},
                {3,9,27},
                {25,10,250},
        };
    }

    @DataProvider(name = "testDataSqr")
    public Object[][] testDataSqr() {
        return new Object[][] {
                {3,9},
                {10,100},
                {9,81},
        };
    }

    @DataProvider(name = "testDataSqrt")
    public Object [][] testDataSqrt() {
        return new Object[][] {
                {9,3},
                {100,10},
                {90,9.486832980505138},
        };
    }

    @DataProvider(name = "testDataRound")
    public Object [][] testDataRound() {
        return new Object[][]{
                {101.1312,101},
                {10.500,11},
                {132.499,132},
        };
    }
}
