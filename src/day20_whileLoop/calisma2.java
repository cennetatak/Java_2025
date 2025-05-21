package day20_whileLoop;

import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {


        // Kullanicidan pozitif sayilar girmesini isteyin
        // kullanici pozitif sayilar girdigi muddetce
        // girilen sayilari toplayin
        // Kullanici islemi bitirmek istediginde 0 bassin
        // Kullanici negatif deger girerse, kullaniciya uyari yazdirin
        // girilen negatif sayiyi isleme dahil etmeyin


        Scanner scanner = new Scanner(System.in);

         int girilensayi = 10;
        int girilenSayilarToplami = 0;
        while (girilensayi!=0){
            System.out.println("lütfen pozitif sayı giriniz ");
             girilensayi = scanner.nextInt();
           if (girilensayi>0){
                girilenSayilarToplami+= girilensayi;
           } else if (girilensayi<0) {
               System.out.println("pozitif bir sayı girmelisiniz...");

           }else {
               System.out.println("girilen pozitif sayılar toplamı:  "+girilenSayilarToplami);
           }


        }
    }
}
