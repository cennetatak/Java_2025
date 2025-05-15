package day03_kullanicidanBilgiAlma_Scanner;
import  java.util.Scanner;
public class C05_KullanıcıBilgileriniYazdırma {
    public static void main(String[] args) {


        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //		girilen bilgiler : J Doe, 44

       Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen isminizi yazınız...");
        char isminİlkHarfi = scanner.nextLine().toUpperCase().charAt(0);

        /* Kullanicidan metin degeri alinacaksa
            scanner.next() veya scanner.nextLine() kullanabiliriz
            ikisi arasinda tek bir fark var

            scanner.next() : Kullanici birden fazla kelime girse de
                             ilk kelimeyi (ilk space'e kadar olan kismi) alir

            scanner.nextLine() : girilen satirdaki tum harfleri ve kelimeleri alir

            EGER kullanicidan TEK BIR karakter alacaksak
            scanner.nextChar() olmadigi icin
            once scanner.nextLine() ile tum metni alip
            sonra o metnin ilk harfini charAt(0) ile alabiliriz.

            ONEMLI NOT  :
            eger kullanicidan birden fazla metin degeri alacaksak
            scanner.nextLine() ile almaniz tavsiye edilir
            eger ilk degeri scanner.next() ile sonraki degeri scanner.nextLine() ile alirsaniz
            sorun yasayabilirsiniz

         */

        System.out.println("lütfen soyisminizi yazınız...");
        String soyisim = scanner.nextLine();

        System.out.println("lütfen yaşınızı giriniz...");
        int yas = scanner.nextInt();

        System.out.println("Girilen Bilgiler:" + isminİlkHarfi + " " + soyisim + ", " + yas);








    }




}
