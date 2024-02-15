package org.abbtech.lesson2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();
        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();
        System.out.println("operation 1+, 2-, 3*, 4/");
        int operation = sc.nextInt();
        double result = 0;
        if (operation == 1) {
            result = topla(b, a);
        } else if (operation == 2) {
            result = cixma(a, b);
        } else if (operation == 3) {
            result = vurma(a, b);
        } else if (operation == 4) {
            result = bolme(a, b);
        } else {
            System.out.println("operation is't not vaqlid");
        }
        System.out.println("result= " + result);
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static double cixma(double a, double b) {
        return a + b;
    }

    public static double vurma(double a, double b) {
        return a + b;
    }

    public static double bolme(double a, double b) {
        return a + b;
    }

}
