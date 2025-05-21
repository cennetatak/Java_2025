package day18_methodOlusturma;

import java.util.Scanner;

public class calisma1 {
    public static void main(String[] args) {

buyukOlmayaniYazdir(3,9);
ogrenciNotuSonucu(90);
isimDuzenleme();
rakamıIsmeCevirme();
    }
        // verilen 2 sayidan buyuk olmayani yazdiran bir method olusturun

        public static void buyukOlmayaniYazdir ( int sayi1, int sayi2){

            System.out.println(sayi1>sayi2 ? sayi2 :sayi1);

        }

        // verilen öğrenci notunu kontrol edip
        // notu 50 veya daha buyukse "sinifi gectin" ve
        // noto 50 nin altında ise " malesef kaldın " yazdıran bir metod oluşturun

public static void ogrenciNotuSonucu (int not){
        if (not>50){
            System.out.println("Sınıfı geçtin");
        }else  System.out.println("Malesef kaldın");
}

        // Kullanicidan isim ve soyismini ayri ayri alip
        //  ismi ilk harf buyuk digerleri kucuk,
        //  soyismin tamamini buyuk harflerle yazdiran
        //  bir method olusturun


   public static void isimDuzenleme (){
        Scanner scanner = new Scanner(System.in);
       System.out.println(" lütfen isminizi giriniz");
       String isim= scanner.nextLine();

       System.out.println(" lütfen soyisminizi giriniz");
       String soyIsim= scanner.nextLine();

       System.out.println(isim.toUpperCase().charAt(0) +isim.substring(1).toLowerCase()+" "
               +soyIsim.toUpperCase());

   }
    public static void rakamıIsmeCevirme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir rakam girelim:");
        int rakam = scanner.nextInt();
        String mesaj = " ";
        switch (rakam) {
            case 0:
                mesaj = "sifir";
                break;
            case 1:
                mesaj = "bir";
                break;
            case 2:
                mesaj = "iki";
                break;
            case 3:
                mesaj = "üç";
                break;
            case 4:
                mesaj = "dört";
                break;
            case 5:
                mesaj = "beş";
                break;
            case 6:
                mesaj = "altı";
                break;
            case 7:
                mesaj = "yedi";
                break;
            case 8:
                mesaj = "sekiz";
                break;
            case 9:
                mesaj = "dokuz";
                break;
            default:
                mesaj = "Girilen sayi rakam olmali.";
        }
        System.out.println(mesaj);


    }

}









