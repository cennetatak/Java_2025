package day08_ifElsestatements;

import java.util.Scanner;

public class C06_İfElse_Emeklilik {
    public static void main(String[] args) {


        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz...");
        int sayi = scanner.nextInt();

       if (sayi >= 65){
           System.out.println("emekli olabilirsin");
       } else {
            System.out.println("emekli olmak için" +(65-sayi ) + "yılınız kalmıştır.");
       }




    }
}
