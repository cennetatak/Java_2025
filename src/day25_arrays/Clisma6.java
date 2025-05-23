package day25_arrays;

public class Clisma6 {
    public static void main(String[] args) {


        int[] sayilar1 = {1,2,3,};


        // sayilar array'indeki tum elementlerin toplamini yazdirin

        calisma1.elementlerinToplami(sayilar1);
        System.out.println();


        // sayilar array'indeki tum elementleri toplayin
        // Eger toplam cift sayi ise "Ne guzel array" ,
        // toplam tek sayi ise "Bu array'i begenmedim" yazdirin



        System.out.println();
    // verilen int bir array'deki en buyuk sayiyi bulun
    // sayi 15'den kucuk pozitif bir tamsayi ise sayinin faktoryel degerini yazdirin
    // sayi 15'den kucuk pozitif bir tamsayi degilse en buyuk sayiyi yazdirin

        int enBuyukeleman =calisma2.getenBuyukEleman(sayilar1);
    if (enBuyukeleman%2==0 && enBuyukeleman<15){
        int faktoryel = 1 ;

        for (int i = enBuyukeleman; i >=1 ; i--) {

            faktoryel *= i;

        }
        System.out.println("faktoryel değeri:  "+faktoryel);
    }
}}




