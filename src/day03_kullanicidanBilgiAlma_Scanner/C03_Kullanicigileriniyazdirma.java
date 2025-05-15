package day03_kullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C03_Kullanicigileriniyazdirma {
    public static void main(String[] args) {

       //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("lütfen soyisminizi giriniz ...");
        String soyisim = scanner.nextLine();

        System.out.println("lütfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        System.out.println(
                "isminiz:" +isim +
                        "\nsoyisminiz:" + soyisim +
                        "\nyaşınız:"+ yas +
                        "\nkaydınız başarıyla tamamlanmıştır."
        );



        // alt satırda yazdırması için " \n " yazıyoruz basına




    }



}
