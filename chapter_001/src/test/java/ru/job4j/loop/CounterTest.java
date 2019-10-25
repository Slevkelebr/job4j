package ru.job4j.loop;

import org.junit.Assert;
import  org.junit.Test;

public class CounterTest {
    @Test
    public void sumToStartToFinish(){
        Counter counter = new Counter();
        int sum = counter.add(1,10);
        int expected = 30;
        Assert.assertEquals(sum, expected);
    }

    @Test
    public void sumTo1To23(){
        Counter counter = new Counter();
        int sum = counter.add(1,23);
        int expected = 132;
        Assert.assertEquals(sum, expected);
    }
}
