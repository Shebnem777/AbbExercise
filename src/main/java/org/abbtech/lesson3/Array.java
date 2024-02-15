package org.abbtech.lesson3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ededi daxil edin");
            arr[i] = sc.nextInt();
        }
        System.out.println("cap et");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
