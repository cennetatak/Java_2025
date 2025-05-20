package day15_forLoop;

import java.util.Scanner;

public class C05_sayininRakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi  giriniz...");
        int girilensayi = scanner.nextInt();
        int sayi = girilensayi;

        int rakam = 0;
        int rakamlarToplamı = 0;
        int basamakSayısı =( girilensayi +"").length();

        for (int i = 1; i <=basamakSayısı ; i++) {
            rakam = sayi%10;
            rakamlarToplamı += rakam;
            sayi /=10 ;

        }


        System.out.println("girilen");




    }
}
