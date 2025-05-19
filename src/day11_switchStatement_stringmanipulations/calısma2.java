package day11_switchStatement_stringmanipulations;

import java.util.Scanner;

public class calısma2 {
    public static void main(String[] args) {


        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // istenen gunun hafta ici veya hafta sonu oldugunu yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir deger girerse
        // hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün numarası yazınız...");
        int gunNo = scanner.nextInt();
         String mesaj = " ";

        switch (gunNo){

            case 1 :
                mesaj=" hafta içi";
            case 2 :
                mesaj=" hafta içi";
            case 3 :
                mesaj=" hafta içi";
            case 4 :
                mesaj=" hafta içi";
            case 5 :
                mesaj=" hafta içi";
                break;
            case 6 :
                mesaj = " hafta sonu ";
            case 7 :
                mesaj = " hafta sonu ";
                break;
            default:
               mesaj = "hatalı gün numarası girdinz";



        }

        System.out.println(mesaj);


        // Kullanicidan ismini isteyin
        // ismin ilk ve son harflerini yan yana yazdirin

        System.out.println(" lütfen isminizi giriniz...");
         String isim = scanner.nextLine();



    }
}
