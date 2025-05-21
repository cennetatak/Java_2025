package day18_methodOlusturma;

import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {
        System.out.println(faktoryelHesapla(9));
        System.out.println(vucutKitleEndeksiDondur());
    }


    // verilen 17'den kucuk pozitif bir tamsayi icin
    // faktoryel degerini hesaplayip donduren bir method olusturun

    public static int faktoryelHesapla(int sayi) {

        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
        faktoryel*=i;
        }return faktoryel;

    }
    // Soru 2- Kullanicidan kilo(kg) ve boyunu(cm) isteyip
    //  vucut kitle endeksini hesaplayan ve sonucu donduren bir method olusturun
    //  kilo*10000 / (boy *boy)

    public static double vucutKitleEndeksiDondur (){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" lütfen kilonuzu giriniz ");
       double kilo = scanner.nextDouble();

        System.out.println(" lütfen boyunuzu giriniz ");
        double boy = scanner.nextDouble();

        return  kilo*10000 / (boy *boy);
}
}



