package day05_wrapperClass_Matematikselİslemler_Concatenation;

import java.util.Scanner;

public class C05_RakamlarToplamınıBulma_Odev {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi alip
        // girilen sayinin rakamlar toplamini asagidaki sekilde yazdirin

        //  "Girilen 245 sayisinin rakamlar toplami : 11"

      Scanner scanner = new Scanner(System.in);


      System.out.println("lütfen üç basamaklı bir tamsayı giriniz...");
        int sayi = scanner.nextInt();
      int rakam =0;
      int rakamlarToplamı = 0;
      int girilensayi =0;

      girilensayi=sayi;

        rakam = sayi%10;
        rakamlarToplamı = rakamlarToplamı+ rakam; // rakamlar toplamı 5 oldu
        sayi = sayi/10;// sayı 24 oldu iki basamaklı
        rakam = sayi%10;
        rakamlarToplamı = rakamlarToplamı+ rakam; // 9 oldu

        sayi=sayi/10;
        rakamlarToplamı= rakamlarToplamı+sayi;

        System.out.println("girilen  "+ girilensayi +"sayısının rakamlar toplamı  " +rakamlarToplamı);




    }
}
