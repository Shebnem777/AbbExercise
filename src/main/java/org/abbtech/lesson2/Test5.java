package org.abbtech.lesson2;

import java.util.Scanner;//5. Ededin reqemlerinin sayini tapin.//12345
public class Test5 {
    public static void main(String[] args) {
      int number=12345;
      int sayi=0;
      while (number!=0){
          sayi++;
          number/=10;
      }
        System.out.println("reqemlerin sayi: "+ sayi);
    }
}
