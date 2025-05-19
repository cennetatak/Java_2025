package day09_ifElseİfStatements_nestedİfElse;

import java.util.Scanner;

public class C05_CokluDegisken {
    public static void main(String[] args) {


        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin
        // kullanici yas olarak 15'den kucuk veya 80'den buyuk deger girerse
        // ve K veya E disinda cinsiyet girerse hata mesaji yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        System.out.println("lütfen cinsiyetinizi giriniz... 'E' :erkek  'K': kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        if (yas<15 || yas>80   ||  cinsiyet != 'K' && cinsiyet != 'E')
            System.out.println("girdiğiniz değerler uygun değil");
        else if (cinsiyet=='K' && yas>=60)
            System.out.println("kadın ve yaş 60 dan fazla emekli olabilirsin");
        else if ( cinsiyet=='E' && yas >=65)
            System.out.println("erkek ve 65 yaşından fazla emekli olabilirsin");
        else if (cinsiyet=='K' && yas<60)
            System.out.println("kadınlar 60 yaşında emekli olur bunun için daha   " +(60-yas)+ "çalışmalısın");
        else if (cinsiyet =='E'&& yas<65)
            System.out.println("erkekler 65 yaşında emekli olur bunun için daha  " +(65-yas) +"çalışmalısın");
    }}