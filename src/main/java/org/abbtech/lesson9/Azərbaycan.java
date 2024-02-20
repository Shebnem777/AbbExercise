package org.abbtech.lesson9;

interface Azərbaycan {
    void interact(Armenian armenian);
}
class ŞanlıAzərbaycan implements Azərbaycan {
    public void interact(Armenian armenian) {
        System.out.println("Azərbaycan " + armenian.getClass().getSimpleName() + "la danışıqlar aparmaq istəyir");
    }
}

