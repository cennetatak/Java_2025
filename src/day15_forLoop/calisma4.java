package day15_forLoop;

import java.util.Scanner;

public class calisma4 {
    public static void main(String[] args) {



        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da kod calismali


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir  başlangıç değerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("lütfen  pozitif bir bitiş değerini giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;
       if (baslangic < bitis)
        for (int i = baslangic; i <=bitis ; i++ ) {
            toplam += i;
        }
       else  {
           for (int i = baslangic; i >= bitis; i--) {
           toplam +=i;
           }

       }

        System.out.println("bitiş ve başlangıç değerleri toplamı  " +toplam);











    }
}
