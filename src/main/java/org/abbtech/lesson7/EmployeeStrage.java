package org.abbtech.lesson7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// İşçilərin saxlandığı sinif
class EmployeeStorage {
    private ArrayList<Employee> employees;

    // Konstruktor
    public EmployeeStorage() {
        employees = new ArrayList<>();
    }

    // İşçi əlavə etmək üçün metod
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Təcrübəsi 2-dən böyük olan işçiləri qaytarır
    public ArrayList<Employee> getExperiencedEmployees() {
        ArrayList<Employee> experiencedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() > 2) {
                experiencedEmployees.add(employee);
            }
        }
        return experiencedEmployees;
    }

    // Maksimum maaşlı işçini qaytarır
    public Employee getEmployeeWithMaxSalary() {
        return Collections.max(employees, Comparator.comparingDouble(employee -> {
            if (employee instanceof FullTimeEmployee) {
                return ((FullTimeEmployee) employee).getSalary();
            } else if (employee instanceof PartTimeEmployee) {
                return ((PartTimeEmployee) employee).calculateSalary();
            } else {
                return 0.0;
            }
        }));
    }

    // Minimum maaşlı işçini qaytarır
    public Employee getEmployeeWithMinSalary() {
        return Collections.min(employees, Comparator.comparingDouble(employee -> {
            if (employee instanceof FullTimeEmployee) {
                return ((FullTimeEmployee) employee).getSalary();
            } else if (employee instanceof PartTimeEmployee) {
                return ((PartTimeEmployee) employee).calculateSalary();
            } else {
                return Double.MAX_VALUE;
            }
        }));
    }
}