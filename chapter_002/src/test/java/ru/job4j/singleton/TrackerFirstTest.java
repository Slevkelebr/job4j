package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerFirstTest {

    @Test
    public void trackerFirstOnly() {
        TrackerFirst tracker1 = TrackerFirst.INSTANCE;
        TrackerFirst tracker2 = TrackerFirst.INSTANCE;
        assertSame(tracker1, tracker2);
    }

}