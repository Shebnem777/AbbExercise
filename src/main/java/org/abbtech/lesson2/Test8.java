package org.abbtech.lesson2;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        calculate();
    }

    public static double calculate() {//Calculator hazirlayın hərbir rəqəm və əmirlər(+,-,*,/,%) scannerlə daxil edilsin(switch-case ilə əmrləri sıralayın)
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();
        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();
        System.out.println("operation 1+, 2-, 3*, 4/");
        int operation = sc.nextInt();
        double result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println(result+"-case1");
                break;
            case 2:
                result = a - b;
                System.out.println(result+"-case2");
                break;
            case 3:
                result = a * b;
                System.out.println(result+"-case3");
                break;
            case 4:
                result = a / b;
                System.out.println(result+"-case4");
                break;
            default:
                result = -1;
                System.out.println("case d");
        }
        return result ;
    }
}
