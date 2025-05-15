package day03_kullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class calısma1 {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayi alın
        //ve girilen tam sayinin on katını asagıdakı sekılde yazdırın
        // orn: input=>5 ouput => girilen sayının on katı . 50

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir tam sayı giriniz...");
         int girilenSayi = scanner.nextInt();

        System.out.println("girilen sayinin on kati:" + girilenSayi * 10);

    }
}
