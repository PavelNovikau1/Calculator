package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTests extends BaseTest {

    @Test(description = "Checking with two positive numbers", priority = 2,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] - setOfSourceNumbers[1]),
                calculator.subtraction(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking with two negative numbers", priority = 1)
    public void checkWithTwoNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[2] - setOfSourceNumbers[3]),
                calculator.subtraction(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

    @Test(description = "Checking with  integer & fractional numbers", priority = 3)
    public void checkWithOneIntegerAndFractionalNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[1] - setOfSourceNumbers[2]),
                calculator.subtraction(setOfSourceNumbers[1], setOfSourceNumbers[2]));
    }

    @Test(description = "Checking subtraction function with input data",
            dataProvider = "Set of different numbers", priority = 4)
    public void subtractionWiInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum - secondNum),
                calculator.subtraction(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertEquals((setOfSourceNumbers[4] - setOfSourceNumbers[1]),
                calculator.summation(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

}
