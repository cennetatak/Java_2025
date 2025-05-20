package day13_stringManipulations;

import java.util.Scanner;

public class calısma1 {
    public static void main(String[] args) {




        // Kullanicidan bir metin isteyin
        // metnin Java icerip icermedigini indexOf()'dan faydalanarak yazdirin


     Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz....");
        String metin = scanner.nextLine();



        if ( metin.indexOf("Java") !=-1){
            System.out.println(" girilen metin Java içeriyor....");
        }else {
            System.out.println("girilen metin Java içermiyor ");
        }


        // str'da 3 adet "at" gectigi biliniyorsa
        // 3. "at" kelimesinin index'ini yazdirin


       String str = "Ali topu at , at Ali at ";

        int atinİlkINdexi = str.indexOf("at");
        System.out.println("Atın ilk indexi :" + atinİlkINdexi);

       int atinİkinciIndexi = str.indexOf("at", atinİlkINdexi +1);
        System.out.println(" Atın ikinci ındexi :" + atinİkinciIndexi);

      int atinUcuncuIndexi = str.indexOf("at",atinİkinciIndexi+1);
        System.out.println("Atın üçüncü ındexi: " + atinUcuncuIndexi);

        // str'da top kelimesinin 1. , 2. ve 3. kullanimlarinin index'lerini yazdirin

         int topunİlkIndexi = str.indexOf( "top");
        System.out.println(" Topun ilk ındexi :" + topunİlkIndexi);

        int topunİkinciIndexi = str.indexOf("top",topunİlkIndexi+1);
        System.out.println(" Topun ikinci  ındexi :" + topunİkinciIndexi );

        int topunucuncuIndexi = str.indexOf("top",topunİkinciIndexi+1);
        System.out.println(" Topun üçüncü ındexi :" + topunucuncuIndexi);




    }
}
