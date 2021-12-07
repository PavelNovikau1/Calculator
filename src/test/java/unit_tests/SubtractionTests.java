package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTests extends BaseTest {

    @Test(description = "Checking subtraction function with two positive numbers test", priority = 2,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] - setOfSourceNumbers[1]),
                calculator.subtract(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking subtraction function with two negative numbers test", priority = 1)
    public void checkWithTwoNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[2] - setOfSourceNumbers[3]),
                calculator.subtract(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }

    @Test(description = "Checking subtraction function with  integer & fractional numbers test", priority = 3)
    public void checkWithOneIntegerAndFractionalNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[1] - setOfSourceNumbers[2]),
                calculator.subtract(setOfSourceNumbers[1], setOfSourceNumbers[2]));
    }

    @Test(description = "Checking subtraction function with input data test",
            dataProvider = "Set of different numbers", priority = 4)
    public void subtractionWiInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum - secondNum),
                calculator.subtract(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer test", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertNotEquals(invalidValue, calculator.subtract(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
