package org.abbtech.Lesson6;

public class Main {
        public static void main(String[] args) {

            PersonManager<Person> manager = new PersonManager<>(10);

            Student student1 = new Student("Shabnam", 29);
            Student student2 = new Student("Shalala", 28);
            Teacher teacher1 = new Teacher("Məmməd", 35);
            Teacher teacher2 = new Teacher("Gulay", 33);

            manager.addItem(student1);
            manager.addItem(student2);
            manager.addItem(teacher1);
            manager.addItem(teacher2);

            System.out.println("Bütün elementlər:");
            manager.displayAllItems();

            System.out.println("\nID-i 2 olan element:");
            System.out.println(manager.searchItem(2));


            System.out.println("\nID-i 2 olan element silinir:");
            manager.removeItem(2);

            System.out.println("\nSilindikdən sonra bütün elementlər:");
            manager.displayAllItems();

            System.out.println("\nElementlərin sayı: " + manager.countItems());

            System.out.println("\nID 1 unikal: " + manager.isUnique(1));
            System.out.println("ID 2 unikal: " + manager.isUnique(2));
        }
    }

