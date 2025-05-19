package day09_ifElseİfStatements_nestedİfElse;

import java.util.Scanner;

public class C03_indirimliFiyatHesaplama {
    public static void main(String[] args) {

        // Kullaniciya kac adet urun aldigini ve bir urunun fiyatini sorun
        // eger kullanici 100 adet veya daha fazla aldiysa %25,
        // eger 50 adet veya daha fazla aldiysa %20
        // eger 10 adet veya daha fazla aldiysa %10 indirim yaparak
        // odeyecegi toplam miktari yazdirin
        // Kullanici negatif bir fiyat veya adet girerse uyari verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen aldığınız ürün adedini yazınız");
        int adet = scanner.nextInt();

        System.out.println("lütfen aldığınız  ürünün birim fiyatını yazınız");
        double birimFyt = scanner.nextDouble();
         double indirimsizToplamfiyat= adet * birimFyt;

        if (adet>=100) System.out.println("%25 indirimli fiyat  " + indirimsizToplamfiyat *75/100);
        else if(adet >= 50) System.out.println("%20 indirimli fiyat  " + indirimsizToplamfiyat *80/100);
        else if(adet>=10) System.out.println("%10 indirimli fiyat  " + indirimsizToplamfiyat * 90/100);
        else if (adet>=0) System.out.println("indirimsiz toplam fiyat  "  +indirimsizToplamfiyat);
        else System.out.println("girilen aded hatalı");


    }


    }

