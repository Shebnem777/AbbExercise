package org.abbtech.Lesson5;


interface Employee {
    double calculateSalary(); // İşçinin maaşı

    void displayDetails(); // İşçinin detalları
}

class FullTimeEmployee implements Employee {
    private String name;
    private int id;
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;

        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary; // Aylıq maaşı qaytarır
    }

    @Override
    public void displayDetails() {
        System.out.println("Ad: " + name);
        System.out.println("ID: " + id);

        System.out.println("MonthlySalary: " + monthlySalary);
        System.out.println();
    }
}

class PartTimeEmployee implements Employee {
    private String name;
    private int id;
    private double hourlyRate;
    private int hoursWorked;

     public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // İşçinin maaşını hesablamaq üçün
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Ad: " + name);
        System.out.println("ID: " + id);
        System.out.println("hourlyRate: " + hourlyRate);
        System.out.println("hoursWorked: " + hoursWorked);

    }
}


