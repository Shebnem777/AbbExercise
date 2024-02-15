package org.abbtech.lesson4;//task2

public class Counter {
    public static void main(String[] args) {
        CountTest();
    }

    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void CountTest() {
        Counter s1 = new Counter();
        Counter s2 = new Counter();
        Counter s3 = new Counter();

        System.out.println("Numunelerin sayi: " + Counter.getInstanceCount());
        Counter s4 = new Counter();
        Counter s5 = new Counter();

        // instanceCount'u
        System.out.println("numunelerun say: " + Counter.getInstanceCount());
    }

}

