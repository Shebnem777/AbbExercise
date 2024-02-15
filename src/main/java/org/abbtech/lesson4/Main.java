package org.abbtech.lesson4;

public class Main{
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Day: " + day);
            System.out.println(" weekend? " + day.isWeekend());
            System.out.println();
        }
    }

}
