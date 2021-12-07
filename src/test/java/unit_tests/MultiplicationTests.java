package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTests extends BaseTest {

    @Test(description = "Checking multiplication function with two positive numbers test", priority = 1,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] * setOfSourceNumbers[1]),
                calculator.multiply(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking multiplication function with two negative numbers test", priority = 3)
    public void checkWithTwoNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[2] * setOfSourceNumbers[3]),
                calculator.multiply(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

    @Test(description = "Checking multiplication function with null & negative num test", priority = 2)
    public void checkWithNullAndNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[3] * setOfSourceNumbers[4]),
                calculator.multiply(setOfSourceNumbers[3], setOfSourceNumbers[4]));
    }

    @Test(description = "Checking multiplication function with input data test",
            dataProvider = "Set of different numbers", priority = 4)
    public void multiplicationWithInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum * secondNum),
                calculator.multiply(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer test", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertNotEquals(invalidValue, calculator.multiply(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
