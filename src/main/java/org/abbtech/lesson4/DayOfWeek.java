package org.abbtech.lesson4;

public enum DayOfWeek {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend(){
        return this ==SATURDAY || this==SUNDAY;
    }
}
