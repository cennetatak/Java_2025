package day20_whileLoop;

public class calisma1 {
    public static void main(String[] args) {


        // 2 basamakli pozitif tamsayilari
        // buyukten kucuge dogru, aralarinda bir bosluk olacak sekilde yazdirin


        for (int i = 99; i >=10 ; i--) {
            System.out.print(i +" ");
        }
        System.out.println();

        int sayi =99;
        while (sayi>=10){
            System.out.print(sayi +" ");
            sayi--;
        }

        System.out.println();
        // verilen pozitif tamsayidan baslayarak
        // ilk 10 sayiyi yazdirin

           int sayi2 = 33;

        for (int i = 0; i <=9 ; i++) {
            System.out.print(sayi2  + i + " ");
        }
        System.out.println();

        sayi2=33;
        int sayac = 0 ;
        while(sayac <=9){
            System.out.print(sayi2 +sayac + " ");
            sayac++;
        }


    }
}
