package ru.job4j.calculator;

public class Calculator {
    private double result;

    /**
     * Calculate summ of two numbers.
     * @param  first .
     * @param  second .
     * @return summ.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Calculate multiplication of two numbers.
     * @param  first .
     * @param  second .
     * @return multiplication result.
     */
    public void multiple (double first, double second) {
        this.result = first * second;
    }
    /**
     * Calculate division of two numbers.
     * @param  first .
     * @param  second .
     * @return division.
     */
    public void division (double first, double second) {
        this.result = first / second;
    }

    /**
     * Calculate subtraction of two numbers.
     * @param  first .
     * @param  second .
     * @return subtraction.
     */
    public void subtraction(double first, double second) {
        this.result = first - second;
    }
    public double getResult() {
        return this.result;
    }
}