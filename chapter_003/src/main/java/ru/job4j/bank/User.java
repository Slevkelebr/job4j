package ru.job4j.bank;

/**
 * Банковские переводы.
 * @author Slevkelebr
 * @version 1.0
 * @since 25.12.2019
 */

import java.util.Objects;

public class User {
    private String name, passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return passport == user.passport && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
}
