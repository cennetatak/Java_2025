package day04_dataCasting;

import java.util.Scanner;

public class calısma1 {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // ve 1.sayiyi, 2.sayiya bolup bolme isleminin sonucunu yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen iki tam sayı giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        System.out.println(sayi1 +"/" + sayi2 + "="  + sayi1/sayi2);


        //sonucu ondalıklı olarak yazdır

        double sonuc = (double)sayi1/sayi2;

        System.out.println("sayı1'i double veriable cast edince sonuç;" + sonuc);

    }
}
