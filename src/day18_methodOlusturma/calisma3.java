package day18_methodOlusturma;

import day19_MethodOlusturma.C02_FaktoryelDegeriDondurme;
import day19_MethodOlusturma.C04_VucutKitleEndexiHesapla;

public class calisma3 {
    public static void main(String[] args) {

        // verilen 17'den kucuk pozitif bir tamsayi alın
        // faktoryel degerini hesaplayip
        // faktoryel degeri 1000000'dan kucukse "iyi sayi yazmissin"
        // faktoryel degeri 1000000 veya daha buyukse, "bu sayiyi nerden buldun?" yazdirin

          int faktoryel  =calisma2.faktoryelHesapla(13);
        System.out.println(faktoryel);
      if (faktoryel<1000000){
          System.out.println(" İyi sayı yazmışsın ");
      }else System.out.println(" bu sayıyı nerden buldun");

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.

       double vke =calisma2.vucutKitleEndeksiDondur();
        System.out.println(vke);
       if (vke>=30){
           System.out.println("obez");
       } else if (vke>=25) {
           System.out.println("kilolu");
       } else if (vke>=20) {
           System.out.println("normal");
       }else System.out.println("zayıf");

    }
}
