package org.abbtech.lesson2;

import java.util.Scanner;
public class Test6 {//"İstifadəçidən ay nömrəsini daxil etməyi təklif edən proqram yazın. Sonra daxil edilmiş ay nömrəsinə əsasən həmin ayın adını çap edən keçid-case strukturundan istifadə edərək proqramı tamamlayın.
    // Məsələn, istifadəçi 1-i daxil edərsə, proqram bunu etməlidir. 'Yanvar' yaz, istifadəçi 2 daxil edərsə, 'Fevral' yazmalıdır; və s."

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month = scanner.nextInt();
       switch (month){
           case 1:
               System.out.println("Yanvar");
               break;
           case 2:
               System.out.println("Fevral");
               break;
           case 3:
               System.out.println("Mart");
               break;
           case 4:
               System.out.println("Aprel");
               break;
           case 5:
               System.out.println("May");
               break;
           case 6:
               System.out.println("Iyun");
               break;
       }
       }
    }

