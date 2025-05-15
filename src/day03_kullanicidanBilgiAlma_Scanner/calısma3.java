package day03_kullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class calısma3 {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //		girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz...");
        char isminİlkHarfi = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("lütfen oyisminzi giriniz...");
        String soyİsim = scanner.nextLine();

        System.out.println("lütfen yaşınızı giriniz...");
        int yas = scanner.nextInt();

        System.out.println("isminiz:" + isminİlkHarfi + " " + soyİsim +", " + yas +

                            "\nkaydınız başarıyla tamamlanmıştır."

        );




    }
}
