package org.abbtech.Lesson5;

public class Outer {
        // Daxili statik sinif (Inner)
        public static class Inner {
            // Daxili sinifde yuvalanmış şəxsi statik sahə
            private static int count = 0;

            // Konstruktor - hər yeni instansiya yarandıqda count sahəsini artırır
            public Inner() {
                count++;
            }

            // getCount() metodunu tətbiq edin - count sahəsinin dəyərini qaytarır
            public static int getCount() {
                return count;
            }
        }

        // Main metodu tətbiq edin
        public static void main(String[] args) {
            // Daxili sinif nümunələrini yarat
            Inner inner1 = new Inner();
            Inner inner2 = new Inner();
            Inner inner3 = new Inner();

            // getCount() metodu ilə nümunələrin sayını çap et
            System.out.println("Yaradılan nümunələrin sayı: " + Inner.getCount());
        }
    }
