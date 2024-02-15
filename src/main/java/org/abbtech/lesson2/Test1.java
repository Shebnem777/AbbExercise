package org.abbtech.lesson2;
import java.util.Scanner; //1. 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et. Ipucu: % ve / istifade edeceksiniz

//meselen: 5 daxil edirem. 0,2 ve 4 reqemleri 2-ye

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ədəd daxil edin");
        int userInput = scanner.nextInt();
        System.out.println("2-ə bolune bilen ededler");
        for (int i = 0; i <= userInput; i++) {
            if (i % 2 == 0) { //qaliqlar olmadiqi ucun 2-e bolunenler gorunecek
                System.out.println(i + " ");
            }
        }
    }
    }