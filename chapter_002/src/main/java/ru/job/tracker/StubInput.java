package ru.job.tracker;

public class StubInput implements Input {

    private final String[] value;
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }


    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        return key;
    }
}
