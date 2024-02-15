package org.abbtech.lesson2;

import java.util.Scanner;//0-dan verilmish edede qeder sade ededleri chap et.Eded ancaq ozune ve 1-e bolunurse edede sade eded deyilir.
// meselen: 3 reqemi 3-e yeni ozune ve 1-e bolunur ancaq 4 reqemi 4-e yeni ozune, 1-e ve elave olaraq 2-ye de bolunur.
// Ipucu: % ve / istifade edeceksiniz

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int number = scanner.nextInt();
        System.out.println(number+"-qeder sade ededler");
        for (int i = 0; i <=number ; i++){
            if (i%2!=0)
            System.out.println(i);
}
    }
}
