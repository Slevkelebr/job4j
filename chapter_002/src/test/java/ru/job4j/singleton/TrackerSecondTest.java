package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSecondTest {

    @Test
    public void trackerSecondOnly() {
        TrackerSecond first = TrackerSecond.getInstance();
        TrackerSecond second = TrackerSecond.getInstance();
        assertSame(first, second);
    }

}