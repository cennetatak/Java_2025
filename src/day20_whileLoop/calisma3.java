package day20_whileLoop;

import java.util.Scanner;

public class calisma3 {
    public static void main(String[] args) {

        // asagidaki gorevi yapan bir method olusturun

        // kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
        // (ilk harfi Q olan bir kelime degil, sadece Q'ya basmalidir)
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
        // esit sayida harfe sahip isimlerden herhangi biri olabilir

        Scanner scanner = new Scanner(System.in);
        String girilenisim = "";
        String enUzunİsim = "";

     while(!girilenisim.equalsIgnoreCase("q")){
         System.out.println("lütfen istediğiniz ismi giriniz  \nişleminizi bitirmek için 'Q' ya basınız....");
         girilenisim= scanner.nextLine();
          if (girilenisim.length()>enUzunİsim.length()){
              enUzunİsim=girilenisim;

          }

     }
        System.out.println(" Girilen en uzun isim: "+ enUzunİsim);

        enUzunIsmiYazdir();


    }
         public static void enUzunIsmiYazdir (){

             Scanner scanner = new Scanner(System.in);
             String girilenisim = "";
             String enUzunİsim = "";

             while(!girilenisim.equalsIgnoreCase("q")){
                 System.out.println("lütfen istediğiniz ismi giriniz  \nişleminizi bitirmek için 'Q' ya basınız....");
                 girilenisim= scanner.nextLine();
                 if (girilenisim.length()>enUzunİsim.length()){
                     enUzunİsim=girilenisim;

                 }

             }
             System.out.println(" Girilen en uzun isim: "+ enUzunİsim);






         }


         public static String getEnUzunIsim(){

             Scanner scanner = new Scanner(System.in);
             String girilenisim = "";
             String enUzunİsim = "";

             while(!girilenisim.equalsIgnoreCase("q")){
                 System.out.println("lütfen istediğiniz ismi giriniz  \nişleminizi bitirmek için 'Q' ya basınız....");
                 girilenisim= scanner.nextLine();
                 if (girilenisim.length()>enUzunİsim.length()){
                     enUzunİsim=girilenisim;

                 }

             }
            return enUzunİsim;


         }
}
