package calculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    @Test
    public void onePlusOneReturnsTwo() {
        Calculator calculator = new Calculator();

        assertThat(calculator.sum(1, 1), equalTo(2));
    }

}
