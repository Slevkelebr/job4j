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
        List<Address> result = profiles.collect(profile);
        List<Address> expected = Arrays.asList(new Address("Moscow", "Gagarina", 23, 10));
        assertThat(result.get(0).getCity(), is(expected.get(0).getCity()));
    }

}