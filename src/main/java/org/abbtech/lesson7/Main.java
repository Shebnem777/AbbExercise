package org.abbtech.lesson7;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // İşçiləri saxlayan bir EmployeeStorage obyekti yaradırıq
        EmployeeStorage employeeStorage = new EmployeeStorage();

        // İşçiləri yarat və əlavə et
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Shabnam", 3, 1000);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Shalala", 1, 800);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Malik", 2, 30, 20);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Aysel", 4, 25, 20);

        employeeStorage.addEmployee(fullTimeEmployee1);
        employeeStorage.addEmployee(fullTimeEmployee2);
        employeeStorage.addEmployee(partTimeEmployee1);
        employeeStorage.addEmployee(partTimeEmployee2);

        // Təcrübəsi 2-dən böyük olan işçiləri göstər
        ArrayList<Employee> experiencedEmployees = employeeStorage.getExperiencedEmployees();
        for (Employee employee : experiencedEmployees) {
            System.out.println(employee);
        }

        // Maksimum maaşlı işçini göstər
        System.out.println("Maksimum maaşlı işçi: " + employeeStorage.getEmployeeWithMaxSalary());

        // Minimum maaşlı işçini göstər
        System.out.println("Minimum maaşlı işçi: " + employeeStorage.getEmployeeWithMinSalary());
    }
}
