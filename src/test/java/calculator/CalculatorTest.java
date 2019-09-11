package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void onePlusOneReturnsTwo() {
        assertThat(calculator.sum(1, 1), equalTo(2));
    }

    @Test
    public void onePlusTwoReturnsThree() {
        assertThat(calculator.sum(1, 2), equalTo(3));
    }

    @Test
    public void twoMinusOneReturnsOne(){
        assertThat(calculator.subtract(2, 1), equalTo(1));
    }

    @Test
    public void threeMinusOneReturnsTwo(){
        assertThat(calculator.subtract(3, 1), equalTo(2));
    }

    // soma e multiplica

    // soma e subtrai

}
