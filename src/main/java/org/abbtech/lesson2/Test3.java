package org.abbtech.lesson2;

import java.util.Scanner;//Verilmish ededin butun ededleri cemini tap.Ipucu: %, / ve while istifade edeceksiniz Mes: 12345 olarsa 1+2+3+4+5

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int number= sc.nextInt();
      int sum =0;
      while(number>0){
          sum+=number%10;
          number/=10;
      }
        System.out.println("sum= "+ sum);
    }

}