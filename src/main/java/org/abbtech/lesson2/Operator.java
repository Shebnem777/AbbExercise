package org.abbtech.lesson2;

import org.abbtech.lesson4.Car;

import javax.swing.*;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        whileEmeliyyatlari ();
        emeller();
        exercise();
        main3();
        main2();
        testAritmeticOperator();
        testUnaryOperator();
        assigmentOperator();
        testTernary();
        double a = 20;
        double b = 37;
        double cem = a + b;
        double ferq = a / b;
        double perimeter = a - b;
        boolean different = a > b;
        System.out.println(cem);
        System.out.println(perimeter);
        System.out.println(different);
        System.out.println("ferq     " + ferq);

        int age = 4;
        if (0 > 2) {
            System.out.println("iftan");
        } else {
            System.out.println("children");
        }
        Scanner sc = new Scanner(System.in);

        double y = sc.nextDouble();
        System.out.println("y " + y);
        double r = sc.nextDouble();
        System.out.println("r" + r);
        double result = sc.nextDouble();

        double s;
        if (result == 1) {
            s = y / r;
        } else if (result == 2) {
            s = y - r;
        } else if (result == 3) {
            s = y + r;
        } else {
            s = 0;

        }
        System.out.println("result " + s);
    }

    static void testAritmeticOperator() {
        int c = 13;
        int d = 5;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c % d);
    }

    static void testUnaryOperator() {
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        int y = 10;
        System.out.println(x++ + ++x);
        System.out.println(y++ + y++);
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = true;
        System.out.println(!c);
        System.out.println(!d);

    }

    static void assigmentOperator() {
        int a = 10;
        int b = 20;
        a += 4;//a=a+4
        b -= 4;//b=b-4
        a *= b;//a=*b
        a /= b;//a/b
        a %= b;//a%b
        System.out.println(a);
    }

    static void testTernary() {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);

    }

    public static void main2() {
        int age = 10;
        if (age > 0 && age <= 2) {
            System.out.println("iftant");
        }
        if (age > 2 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age < 19) {
            System.out.println("TEEnger");
        } else {
            System.out.println("Adult");

        }


    }

    public static void main3() {
        char grade = 'B'; //// Assign the grade value ('A', 'B', 'C', 'D', or 'F')
        switch (grade) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            default:
                System.out.println("Failed. Please retake the exam");
        }
    }

    public static void exercise() {
        int x = 13;
        int y = 7;
        System.out.println("The result is:" + (x + y));//20
        System.out.println("The result is:" + x + y);//137


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
        for (int a = 0; a < 3; a++) {
            System.out.print("===");
            for (int b = 0; b < 1; b++) {
                System.out.print(" ===");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            if (i != 3) {
                System.out.println(i+"=");
            }

        }

    }

    public static void whileEmeliyyatlari() {
        int i=0;
        while (i<10){
            i++;
            if (i==5){
                continue;}
                System.out.println(i+"=while");
            }
        }

    }




