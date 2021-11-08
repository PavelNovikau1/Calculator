package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTests extends BaseTest {

    @Test(description = "Checking with two positive numbers", priority = 1,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] * setOfSourceNumbers[1]),
                calculator.multiplication(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking with two negative numbers", priority = 3)
    public void checkWithTwoNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[2] * setOfSourceNumbers[3]),
                calculator.multiplication(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

    @Test(description = "Checking with null & negative num", priority = 2)
    public void checkWithNullAndNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[3] * setOfSourceNumbers[4]),
                calculator.multiplication(setOfSourceNumbers[3], setOfSourceNumbers[4]));
    }

    @Test(description = "Checking multiplication function with input data",
            dataProvider = "Set of different numbers", priority = 4)
    public void multiplicationWithInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum * secondNum),
                calculator.multiplication(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertEquals((setOfSourceNumbers[4] * setOfSourceNumbers[2]),
                calculator.summation(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
