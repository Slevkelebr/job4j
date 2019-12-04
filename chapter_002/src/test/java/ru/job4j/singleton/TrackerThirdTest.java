package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerThirdTest {

    @Test
    public void trackerThirdOnly() {
        TrackerThird tracker1 = TrackerThird.getInstance();
        TrackerThird tracker2 = TrackerThird.getInstance();
        assertSame(tracker1, tracker2);
    }

}