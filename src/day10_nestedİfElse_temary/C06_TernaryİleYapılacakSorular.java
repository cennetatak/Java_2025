package day10_nestedİfElse_temary;

public class C06_TernaryİleYapılacakSorular {
    public static void main(String[] args) {

        // Verilen bir notu kontrol edip
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

       int not = 30;


        System.out.println(not>=50 ?  "sınıfı geçtin ": "malesef kaldın");

        // Verilen iki tamsayidan buyuk olmayan sayiyi yazdirin

        int sayi = 50;
        int sayi2 = 84;
        System.out.println(sayi > sayi2 ? sayi2 : sayi);


        // verilen sayi icin
        // 3'un kati veya 3'un kati degil seceneklerinden
        // uygun olani yazdirin


      int sayi3 =90;
        System.out.println(sayi3%3==0 ? "3'ün katı": "3'ün katı değil");





    }
}
