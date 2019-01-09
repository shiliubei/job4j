package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenFirstLessThenSecond() {
        Counter summ = new Counter();
        int result = summ.add(1, 10);
        assertThat(result, is(30));
    }


}
