package ru.job.tracker;

public class StubInput implements Input {

    private final String[] value;
    private int position = 0;

    public StubInput(final String[] value) {
        this.value = value;
    }


    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, int[] range) {
        boolean exit = false;
        int key = Integer.valueOf(this.value[this.position++]);
        for (int value : range) {
            if (value == key) {
                exit = true;
                break;
            }
        }
        if (exit) {
            return key;
        } else {
            throw new MenuOutException("Please select key from menu.");
        }
    }
}
