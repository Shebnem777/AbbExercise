package org.abbtech.lesson4;

public class Car {

    public String brand;
        public String model;
        public int yearOfProduction;
        public String fuelType;
        public double speed;
    public Car(String brand, String model, int yearOfProduction, String fuelType){
            this.brand = brand;
            this.model = model;
            this.yearOfProduction = yearOfProduction;
            this.fuelType = fuelType;
            this.speed = 0;
        }

    public void speed ( double SuretArtir){
            speed += SuretArtir;
        }
        public void slow ( double SuretAzalt){
            speed -= SuretAzalt;
        }
        public void stop () {
            speed = 0;
        }
        public void checkSpeed ( double speedLimit){
            if (speed > speedLimit) {
                System.out.println("Suret heddini asdiniz!!!");
            } else {
                System.out.print("Suret heddiniz");
            }
        }public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getSpeed() {
        return speed;
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Fly", 2024, "new");
        myCar.speed(92);
        System.out.println("Suret "+myCar.getSpeed());
        myCar.checkSpeed(90);

    }
    }

