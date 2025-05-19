package day10_nestedİfElse_temary;

import java.util.Scanner;

public class C02_harfKontrolü {
    public static void main(String[] args) {


         /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici ingilizce harfler disinda bir karakter girerse
                - "Tanimlanmamis karakter" yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);


        // ana degisken girilen harfin kucuk veya buyuk harf olmasini sectik

        if (karakter>='a'  && karakter<='z'){
           // küçük harler bölümü
            if (karakter=='a') System.out.println("güzel harf");
            else if (karakter=='b' || karakter=='c'||karakter=='d') System.out.println("idare eder");
            else System.out.println("girilen küçük harfi beğenmedim");


        } else if (karakter>='A'  && karakter<='Z') {
            //büyük harfler bölümü
            if (karakter=='K') System.out.println("güzel harf");
            else if (karakter=='L' || karakter=='V'||karakter=='Z') System.out.println("idare eder");
            else System.out.println("girilen büyük harfi beğenmedim");


        }else
            //ingilizce harfler dışında bir karakter girilirse
            System.out.println("tanımlanmamış karakter");

    }
}
