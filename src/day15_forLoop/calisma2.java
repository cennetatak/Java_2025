package day15_forLoop;

import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {


        // kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri toplayin
        // ve toplami yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen başlangıç değerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("lütfen bitiş değerini giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%5==0)
           toplam +=i;
        }


        System.out.println(" verilen sayılrın arasındaki 5 ile bölünen sayıların toplamı"+toplam);



    }
}
