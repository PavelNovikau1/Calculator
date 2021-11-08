package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTests extends BaseTest {

    @Test(description = "Checking with two positive numbers", priority = 2,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] / setOfSourceNumbers[1]),
                calculator.division(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Checking with positive & negative numbers", priority = 1)
    public void checkWithPositiveAndNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[1] / setOfSourceNumbers[2]),
                calculator.division(setOfSourceNumbers[1], setOfSourceNumbers[2]));
    }

    @Test(description = "Checking with null & negative num", priority = 3)
    public void checkWithNullAndNegativeNumberTest() {
        Assert.assertEquals((setOfSourceNumbers[3] / setOfSourceNumbers[4]),
                calculator.division(setOfSourceNumbers[3], setOfSourceNumbers[4]));
    }

    @Test(description = "Checking division function with input data",
            dataProvider = "Set of different numbers", priority = 4)
    public void divisionWithInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum / secondNum),
                calculator.division(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertEquals((setOfSourceNumbers[3] - setOfSourceNumbers[1]),
                calculator.summation(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
