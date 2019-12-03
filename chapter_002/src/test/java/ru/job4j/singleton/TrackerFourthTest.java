package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerFourthTest {

    @Test
    public void trackerFourthOnly() {
        TrackerFourth tracker1 = TrackerFourth.getInstance();
        TrackerFourth tracker2 = TrackerFourth.getInstance();
        assertEquals(tracker1, tracker2);
    }

}