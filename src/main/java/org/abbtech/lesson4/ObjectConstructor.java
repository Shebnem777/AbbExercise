package org.abbtech.lesson4;

public class ObjectConstructor {
    public static void main(String[] args) {

        Person person = new Person("ALI",30);
        Person person1=new Person("Polad",30);
        System.out.println(person.name);
        System.out.println(person1.age);
    }
}