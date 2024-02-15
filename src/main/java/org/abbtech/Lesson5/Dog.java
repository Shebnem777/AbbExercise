package org.abbtech.Lesson5;

public class Dog extends Mammal{

    @Override
    public void makeSoud() {
        System.out.println("hav");
    }

    @Override
    void describe() {
        System.out.println("dog");
    }
}
