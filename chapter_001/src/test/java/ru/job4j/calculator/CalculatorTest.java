package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivide() {
        Calculator calc = new Calculator();
        calc.division(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtract() {
        Calculator calc = new Calculator();
        calc.subtraction(2, 2);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }

}