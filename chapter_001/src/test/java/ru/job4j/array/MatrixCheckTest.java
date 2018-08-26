package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    /**
     * Test Method of multiple.
     */
    @Test
    public void when2on2() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] table = new boolean[][]{
                {true, false},
                {false, true}
        };
        boolean result = matrix.mono(table);
        assertThat(result, is(true));
    }

    @Test
    public void when3on3() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] table = new boolean[][]{
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };
        boolean result = matrix.mono(table);
        assertThat(result, is(false));
    }
}
