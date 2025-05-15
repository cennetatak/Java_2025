package day02_veriableKullanımı_DataTurleri;

public class C04_DataTurleri {

    public static void main(String[] args) {



        boolean bl1 = true;
        boolean bl2 = false;

        //boolen bl3 "true"; java "" icindeki herseyi string yani metin olarak kabul eder


        char chr1 = 'e';
        char chr2 ='5';
        char chr3 = '$';
        //char chr4 = 'a '; //too many characters in character literal
                           //char tek bir karaktere izin verir
                          // boslukta bir karakterdir.
        char chr4 = ' ';
                          // char bir tırnak bir karakter ile çalışır


        byte byt1 = 20; // hafızada 8 bit yer kaplar
        short shr1 = 20;// 16 bit
        int sayi1 = 20;//32
        long lng1 =20;//64 bit

        int sayi2 = 13647656;  // hafıza da 32 bit yer işgal eder
        int say3 = 0;         // hafıza da 32 bit yer işgal eder
          // int ile oluşturulan veriable sayı ne olursa olsun 32 bit yer işgal eder


        float fl1 = 4.6f;
        float fl2 = 5678.456F;

        double dbl1 =34.678;
        double dbl2 = 45;

        float fl3 = 20;
        float fl4 = 3;

        System.out.println(fl3 / fl4);   // 6,66666665
                                           //float virgulden sonra 6 veya 7 karakter tutar


        double dbl3 =20;
        double dbl4 = 3;
        System.out.println(dbl3 / dbl4); // 6,6666666666666667
        //double virgülden sonra 15 veya 16 karakter tutar.


        String str1 ="java candır";

        System.out.println(  str1.toLowerCase()  );  // java candır

        System.out.println(  str1.toUpperCase()  );  // JAVA CANDIR

        /*
        non-primitive data tutundeki veriable'lar deger ile birlikte hazır
        methodlarda barındırırlar

        ama primitive data turundeki veriable'lar sadece deger barındırırlar



         */
    }
}
