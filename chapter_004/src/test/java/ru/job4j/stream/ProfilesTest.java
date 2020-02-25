package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void allAddress() {
        Address address = new Address("Moscow", "Gagarina", 23, 10);
        List<Profile> profile = Arrays.asList(new Profile(address));
        Profiles profiles = new Profiles();
        List<String> result = profiles.collect(profile);
        List<String> expected = Arrays.asList(new String("Address{" + "city='Moscow" + '\'' + ", street='Gagarina" + '\'' + ", home=23" + ", apartment=10" + '}'));
        assertThat(result, is(expected));
    }

}