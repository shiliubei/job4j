package ru.job.singleton;

import ru.job.tracker.Item;

public class TrackerSingle2 {
    private static TrackerSingle2 instance;

    private TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle2();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
    }
}
