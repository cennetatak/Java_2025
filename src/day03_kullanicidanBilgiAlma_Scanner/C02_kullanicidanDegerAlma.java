package day03_kullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C02_kullanicidanDegerAlma {
    public static void main(String[] args) {

     //kullacıdan bir double
     // birde int sayi alıp bunların toplamını ve carpımını yazdırın


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir ondalıklı sayı giriniz...");
        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("lütfenbir tam sayı giriniz...");
        int girilenTamSayi = scanner.nextInt();

        // girilen sayıların toplamını yazdıralım
        System.out.println("girilenSayılarınToplamı :" +( girilenOndalikliSayi +girilenTamSayi) );

        //girilen sayilarin çarpımlarını yazdıralım
        System.out.println("girilenSayılarınCarpımı :" +(girilenOndalikliSayi * girilenTamSayi));




    }
}
