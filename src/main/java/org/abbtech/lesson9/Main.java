package org.abbtech.lesson9;

public class Main {
    public static void main(String[] args) {
        GameFactory adventureFactory = new GameFactory.AdventureGameFactory();

        Azərbaycan oyuncu1 = adventureFactory.createPlayer();
        Armenian armenian1 = adventureFactory.createArmenian();


        oyuncu1.interact(armenian1);
        armenian1.attack(oyuncu1);


    }

    // Test etmək üçün main metod
    public static void test() {
        main(null);
    }
}
