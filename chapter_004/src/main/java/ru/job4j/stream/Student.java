package ru.job4j.stream;

public class Student implements Comparable<Student> {

    private String name;
    private Integer scope;

    Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.scope, this.getScope());
    }
}
