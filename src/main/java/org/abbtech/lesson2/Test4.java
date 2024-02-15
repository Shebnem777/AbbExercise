package org.abbtech.lesson2;

public class Test4 { //4. 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek

    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("son deyerler");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
