


package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for calculate task.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 12.08.18
 */

public class CalculateTest {
    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Liu";
        String expect = "Echo, echo, echo : Liu";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}