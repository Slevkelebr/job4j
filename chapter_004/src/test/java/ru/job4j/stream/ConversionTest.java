package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConversionTest {

    @Test
    public void whenMatrixToList() {
        Conversion con = new Conversion();
        Integer[][] num = {
                {1, 2},
                {3, 4}
        };
        List<Integer> result = con.matrixNumbersToLostNum(num);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(result, is(expected));
    }

}