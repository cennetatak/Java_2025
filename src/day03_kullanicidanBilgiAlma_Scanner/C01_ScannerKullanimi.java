package day03_kullanicidanBilgiAlma_Scanner;
import  java.util.Scanner;
public class C01_ScannerKullanimi {
    public static void main(String[] args) {


        // kullanıcıdan bir tam sayi alın
        //ve girilen tam sayinin on katını asagıdakı sekılde yazdırın
        // orn: input=>5 ouput => girilen sayının on katı . 50

        //1. adım. bir scanner objesi olusturun
        Scanner scanner= new Scanner(System.in);

        // 2.adım kullaniciya ne istediğinizi yazdırın
        System.out.println("lütfen bir tamsayı giriniz...");

       //3. adim : olusturdugumuz scanner objesini kullanarak
        //        kullanicinin girdiği bilgiyi konsoldan alıp
        //       0luşturdugumuz uygun bir veriable kaydedelim

                int girilenSayi = scanner.nextInt();

        // orn: input=>5 ouput => girilen sayının on katı . 50

        System.out.println(" girilen sayının on katı:" + (girilenSayi) * 10);


    }
}



