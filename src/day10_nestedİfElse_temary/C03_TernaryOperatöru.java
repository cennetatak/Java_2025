package day10_nestedİfElse_temary;

import java.util.Scanner;

public class C03_TernaryOperatöru {
    public static void main(String[] args) {


        // kullanicidan bir sayi alin
        // sayi cift ise "cift sayi",
        // sayi cift sayi degilse "tek sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (sayi % 2 == 0){
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }


        // ternary operatoru if else ile yapilabilen BASIT ISLEMLERI
        // daha kisa ve daha basit sekilde yazmamiza imkan tanir

        System.out.println(sayi% 2==0 ? "çift sayı" : "tek sayı");












    }
}
