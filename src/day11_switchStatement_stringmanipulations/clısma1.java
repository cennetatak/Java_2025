package day11_switchStatement_stringmanipulations;

import java.util.Scanner;

public class clısma1 {
    public static void main(String[] args) {


        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // gun ismini yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir sayi girerse
        // hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir gün numarası giriniz....");
        int gunNo = scanner.nextInt();

         switch (gunNo){

             case 1 :
                 System.out.println("Pazatesi");
             break;
             case 2 :
                 System.out.println("Salı");
             break;
             case 3 :
                 System.out.println("Çarşamba");
                 break;
             case 4 :
                 System.out.println("Perşembe");
                 break;
             case 5 :
                 System.out.println("Cuma");
                 break;
             case 6 :
                 System.out.println("Cumartesi");
                 break;
             case 7 :
                 System.out.println("Pazar");
                break;
             default:
             System.out.println("girdiğiniz gün sayısı yanlış");

         }








    }
}
