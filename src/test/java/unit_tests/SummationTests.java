package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationTests extends BaseTest {

    @Test(description = "Checking summation function with two positive numbers test", priority = 2,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] + setOfSourceNumbers[1]),
                calculator.summarize(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking summation function with two negative numbers test", priority = 3, retryAnalyzer = Retry.class)
    public void checkWithTwoNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[2] + setOfSourceNumbers[3]),
                calculator.summarize(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

    @Test(description = "Checking summation function with positive & negative numbers test", priority = 1)
    public void checkWithPositiveAndNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[1] + setOfSourceNumbers[2]),
                calculator.summarize(setOfSourceNumbers[1], setOfSourceNumbers[2]));
    }

    @Test(description = "Checking summation function with input data test",
            dataProvider = "Set of different numbers", priority = 4)
    public void summationWithInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum + secondNum),
                calculator.summarize(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer test", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertNotEquals(invalidValue, calculator.summarize(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
