package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationTests extends BaseTest {

    @Test(description = "Checking with two positive numbers", priority = 2,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] + setOfSourceNumbers[1]),
                calculator.summation(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking with two negative numbers", priority = 3, retryAnalyzer = Retry.class)
    public void checkWithTwoNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[2] + setOfSourceNumbers[3]),
                calculator.summation(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

    @Test(description = "Checking with positive & negative numbers", priority = 1)
    public void checkWithPositiveAndNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[1] + setOfSourceNumbers[2]),
                calculator.summation(setOfSourceNumbers[1], setOfSourceNumbers[2]));
    }

    @Test(description = "Checking summation function with input data",
            dataProvider = "Set of different numbers", priority = 4)
    public void summationWithInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum + secondNum),
                calculator.summation(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertEquals((setOfSourceNumbers[0] + setOfSourceNumbers[0]),
                calculator.summation(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
