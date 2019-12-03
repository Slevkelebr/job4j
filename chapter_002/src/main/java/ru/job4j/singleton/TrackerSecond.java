package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class TrackerSecond {
    private static TrackerSecond instance;

    private TrackerSecond() {
    }

    public static TrackerSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSecond();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
