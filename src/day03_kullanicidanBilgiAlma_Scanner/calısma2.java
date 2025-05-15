package day03_kullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class calısma2 {
    public static void main(String[] args) {


        //kullacıdan bir double
        // birde int sayi alıp bunların toplamını ve carpımını yazdırın


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir tam sayı giriniz...");
        int girilenTamSayi = scanner.nextInt();

        System.out.println("lütfen ondalıklı bir sayı giriniz...");
        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("girilen tam sayı ve ondalıklı sayı toplamı:" +(girilenTamSayi +
                        girilenOndalikliSayi));

        System.out.println("girilen tam sayı ve ondalıklı sayı çarpımı:"
                + (girilenTamSayi* girilenOndalikliSayi));



    }
}
