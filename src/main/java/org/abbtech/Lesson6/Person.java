package org.abbtech.Lesson6;

public class Person {
    private static int count = 0;
    protected int id;
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++count;
    }

    // Getter metodları
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ad: " + name + ", Yaş: " + age;
    }
}

