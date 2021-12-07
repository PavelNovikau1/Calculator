package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTests extends BaseTest {

    @Test(description = "Dividing two positive numbers test", priority = 2,
            invocationCount = 4, threadPoolSize = 2)
    public void checkWithTwoPositiveNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[0] / setOfSourceNumbers[1]),
                calculator.divide(setOfSourceNumbers[0], setOfSourceNumbers[1]));
    }

    @Test(description = "Dividing positive & negative numbers test", priority = 1)
    public void checkWithPositiveAndNegativeNumbersTest() {
        Assert.assertEquals((setOfSourceNumbers[1] / setOfSourceNumbers[2]),
                calculator.divide(setOfSourceNumbers[1], setOfSourceNumbers[2]));
    }

    @Test(description = "Dividing null & negative num test", priority = 3)
    public void checkWithNullAndNegativeNumberTest() {
        Assert.assertEquals((setOfSourceNumbers[3] / setOfSourceNumbers[4]),
                calculator.divide(setOfSourceNumbers[3], setOfSourceNumbers[4]));
    }

    @Test(description = "Checking division function with input data",
            dataProvider = "Set of different numbers", priority = 4)
    public void divisionWithInputDataTest(double firstNum, double secondNum) {
        Assert.assertEquals((firstNum / secondNum),
                calculator.divide(firstNum, secondNum));
    }

    @Test(description = "Checking with invalid input data and using retryAnalyzer test", priority = 5, retryAnalyzer = Retry.class)
    public void checkWithInvalidInputData() {
        Assert.assertNotEquals(invalidValue, calculator.divide(setOfSourceNumbers[2], setOfSourceNumbers[3]));
    }
}
