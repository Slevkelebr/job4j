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
        Address address2 = new Address("Ufa", "Magi", 25, 11);
        Address address3 = new Address("Moscow", "Gagarina", 23, 10);
        List<Profile> profile = Arrays.asList(new Profile(address), new Profile(address2), new Profile(address3));
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(profile);
        assertThat(result.size(), is(2));
    }

}