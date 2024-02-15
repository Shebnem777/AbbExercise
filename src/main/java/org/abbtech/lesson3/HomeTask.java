package org.abbtech.lesson3;

public class HomeTask {
    public static void main(String[] args) {
        Task1();
        Task2();
        removeDublicate("" );
    }

    public static void Task1() {  //1. Write a Java program to get the index of all the characters of the alphabet.
        for (char simvol = 'A'; simvol <= 'Z'; simvol++) {// ELIFBADAKI SIMVOLLARA GORE
            int indeks = simvol - 'A' + 1;  // Simvolun indeksini hesablayir
            System.out.println(simvol + " - " + indeks);  // Simvolu və onun indeksini çap etmək
        }
    }

    public static void Task2() {
        String s = "The quick brown fox jumps over the lazy dog.";
        System.out.println(s.replaceAll("fox", "cat"));
    }

    public static String removeDublicate(String s) {
        StringBuilder resultBuilder = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                resultBuilder.append(c);
                seen[c] = true;
            }
        }
        return resultBuilder.toString();
    }
}

