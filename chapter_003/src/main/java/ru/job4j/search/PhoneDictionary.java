package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях. Переписано с помощью Stream.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = persons.stream().filter(person -> person != null && person.getName().contains(key) || person.getSurname().contains(key)
                || person.getPhone().contains(key) || person.getAddress().contains(key)).collect(Collectors.toList());
/*        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) != null && persons.get(i).getName().contains(key) || persons.get(i).getSurname().contains(key) || persons.get(i).getPhone().contains(key) || persons.get(i).getAddress().contains(key)) {
               result.add(persons.get(i));
            }
        }*/
        return result;
    }
}