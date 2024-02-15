package org.abbtech.lesson2;
public class Test10 {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    emeller();
    }

    public static void emeller() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(" ");// j=6 olana qeder yan-yana bosluqlar yarandi
            }

            for (int j = 0; i > j; j++) {
                System.out.print("*");// i-ni alib her yenin setrden cap edir
            }
            System.out.println(" ");
        }
    }
    }

