package org.abbtech.Lesson5;

public  class Cat extends Mammal{

    @Override
    public void makeSoud() {
        System.out.println("meow");
    }

    @Override
    void describe() {
        System.out.println("cat");
    }
}
