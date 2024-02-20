package org.abbtech.lesson7;
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    // Konstruktor
    public PartTimeEmployee(String name, int experience, int hoursWorked, double hourlyRate) {
        super(name, experience);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Maaşı hesablamaq üçün metod
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}