package org.abbtech.lesson7;

class Employee {
    protected String name;
    protected int experience;

    // Konstruktor
    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Getter metodu
    public int getExperience() {
        return experience;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Ad: " + name + ", Təcrübə: " + experience;
    }
}



