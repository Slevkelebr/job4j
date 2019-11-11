package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {

    @Test
    public void test() {
        TrgArea treugolnik = new TrgArea(new Point(2, 3), new Point(2, 2), new Point(4, 2));
        double expected = 1.0;
        double out = treugolnik.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}
