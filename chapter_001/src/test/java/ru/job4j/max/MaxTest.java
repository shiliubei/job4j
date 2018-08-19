package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessThenSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstGreaterThenSecond() {
        Max maxim = new Max();
        int result = maxim.max(2,1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxIsThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2,3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMaxIsSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 3,2);
        assertThat(result, is(3));
    }
    @Test
    public void whenMaxIsFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 1,2);
        assertThat(result, is(3));
    }
}
