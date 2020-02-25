package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<String> collect(List<Profile> profiles) {
        return profiles.stream().map(
                address -> {
                    String result = address.getAddress().toString();
                    return result;
                }
        ).collect(Collectors.toList());
    }
}
