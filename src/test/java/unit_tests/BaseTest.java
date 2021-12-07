package unit_tests;

import calculator.Calculator;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class BaseTest {

    Calculator calculator = new Calculator();

    static final double[] setOfSourceNumbers = {5.5, 1, -5.3, -19, 0};
    static final int invalidValue = 100500;

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Before test method was started");
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("After Test method was started");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class method was started");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class method was started");
    }

    @DataProvider(name = "Set of different numbers")
    public Object[][] inputDifferentNumbers() {
        return new Object[][]{
                {3, 4},
                {5, 12},
                {15, -3},
                {6, 1},
                {10, -5},
        };
    }
}
