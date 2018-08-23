package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for finding an element in array.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class FindLoopTest {

    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{6, 10, 5};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayThen0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{8, 7, 6};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}