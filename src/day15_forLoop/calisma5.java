package day15_forLoop;

import java.util.Scanner;

public class calisma5 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz...");
        int sayi = scanner.nextInt();
        int girilensayi = sayi ;
        int rakam = 0;
        int rakamlartoplamı=0;

        int basamaksayısı =(girilensayi+"").length();

        for (int i = 1; i <=basamaksayısı ; i++) {
            rakam = sayi%10;
            rakamlartoplamı+= rakam;
            sayi/=10;
        }
        System.out.println("girilen "+  sayi+"sayısının rakamlar toplamı  :  "+rakamlartoplamı);




    }
}
