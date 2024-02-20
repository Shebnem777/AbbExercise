package org.abbtech.lesson9;
interface GameFactory {
    Azərbaycan createPlayer();
    Armenian createArmenian();
    class AdventureGameFactory implements GameFactory {
        public Azərbaycan createPlayer() {
            return new ŞanlıAzərbaycan();
        }

        public Armenian createArmenian() {
            return new MəğlubErmənistan();
        }

    }}