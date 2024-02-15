package org.abbtech.Lesson5;

public class Main {

    public static void main(String[] args) {
        // 6. Əsas sinifdə, FullTimeEmployee və PartTimeEmployee nümunələrini saxlamaq üçün bir array yaradır.
        Employee[] employees = new Employee[2];

        // 7. array/collection-dan keçid edərək hər işçinin maaşını və detallarını hesablamaq və göstərmək.
        employees[0] = new FullTimeEmployee("Shabnam", 1, 5000);
        employees[1] = new PartTimeEmployee("Shalala", 2, 10, 50);

        for (Employee employee : employees) {
            System.out.println("İşçinin maaşı: " + employee.calculateSalary());
            employee.displayDetails();
        }
    }
}
