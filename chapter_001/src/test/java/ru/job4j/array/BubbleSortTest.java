package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void fromBlendedToOrder() {
        BubbleSort sortArray = new BubbleSort();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = sortArray.sort(input);
        int[] expect = new int[]{1, 2, 4, 6};
        assertThat(result, is(expect));
    }
}
