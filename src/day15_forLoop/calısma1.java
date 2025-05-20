package day15_forLoop;

import java.util.Scanner;

public class calısma1 {
    public static void main(String[] args) {

        // 1000'den 5000'e kadar olan sayilari yanyana
        // aralarinda bir bosluk olacak sekilde yazdirin


        for (int i = 100; i <= 500; i++) {
            System.out.print(i +" ");
        }




        // 101'den 145'e kadar(sinirlar dahil) olan sayilari yanyana
        // aralarinda bir bosluk olacak sekilde yazdirin


        for (int i = 101; i <=145 ; i++) {
            System.out.print(i + " ");
        }
        // 2 basamakli cift sayilari yazdirin

        for (int i = 10; i <=100 ; i+=2) {
            System.out.print( i + " ");
        }
        System.out.println("");
        // 2 basamakli 5 ile bolunebilen sayilarin toplamini yazdirin

        int  toplam =0;
        for (int i = 10; i <=100 ; i/=5) {
            toplam += i;
        }
        System.out.print( toplam);














    }
}
