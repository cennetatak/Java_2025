package day10_nestedİfElse_temary;

import java.util.Scanner;

public class C05_TernaryVsİfElse {
    public static void main(String[] args) {

        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin


        /*
            sayinin 500'den buyuk olup olmadigini
            ternary ile ayirt edebiliriz
            ANCAAAKKKK sayinin rakamlari toplamini bulmak
            veya 10'lar basamagindaki rakami bulup karesini almak
            tek satirda basitce yazabilecegimiz kodlar olmadigindan
            BU gorevde TERNARY KULLANILAMAZ
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt(); // 347

        int rakam = 0;
        int rakamlarToplami = 0;
        double girilenSayi = sayi;

       if (sayi>=500 ){
          rakam= sayi%10;
           rakamlarToplami=rakamlarToplami + rakam;

           sayi /=10;//iki basamaklı oldu
           rakam = sayi%10;

           rakamlarToplami= rakamlarToplami+ rakam;
           sayi/=10;// tek basamaklı oldu
           rakamlarToplami= rakamlarToplami+ sayi;
           System.out.println(girilenSayi + "   sayısının rakamlar toplamı  "+ rakamlarToplami);


       } else {// sayı 500 den büyük deilse
           // birler basamağından kurtulalım 34 oldu
            sayi/=10;
          rakam= sayi%10;
           System.out.println("sayinin 10'lar basamagindaki rakamin karesi" + rakam *rakam);
       }


    }
}
