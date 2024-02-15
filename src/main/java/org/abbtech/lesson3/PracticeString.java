package org.abbtech.lesson3;

import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = s.length();
        System.out.println(a);
        char b = s.charAt(4);
        System.out.println(b);
        char c = s.charAt(s.length() - 1);
        System.out.println(c);
        String substring = s.substring(2, 3);
        System.out.println("subtring= " + substring);
        boolean d = s.contains("la");
        System.out.println("contains =" + d);
        boolean d1 = s.equals("kitab");
        boolean d2 = s.equalsIgnoreCase("kITab");
        System.out.println("equals ignore = " + d2);
        System.out.println("equals= " + d1);
        String r = s.replace(s, "salam");
        System.out.println("evez olundu: " + r);

    }

}

