package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Test for arrayDuplicate.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 26.08.18
 */
public class ArrayDuplicateTest {

    @Test
    public void whenInputMoreThenOneElementArray() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"1", "1", "2", "2", "5"};
        String[] result = duplicate.remuveDuplicates(input);
        String[] expect = new String[]{"1", "5", "2"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenInputOneElementArray() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"1"};
        String[] result = duplicate.remuveDuplicates(input);
        String[] expect = new String[]{"1"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenInputNoElementArray() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{};
        String[] result = duplicate.remuveDuplicates(input);
        String[] expect = new String[]{};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

}
