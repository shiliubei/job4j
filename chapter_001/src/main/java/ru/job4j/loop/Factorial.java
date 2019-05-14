package ru.job4j.loop;

public class Factorial {
    public int fact(int number) {
        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer *= i;
        }
        return answer;
    }
}
