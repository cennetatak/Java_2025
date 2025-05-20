package day13_stringManipulations;

import java.util.Scanner;

public class calısma2 {
    public static void main(String[] args) {


        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor


        Scanner scanner = new Scanner(System.in);
        System.out.println(" lütfen bir cümle giriniz...");
        String cumle = scanner.nextLine();


        System.out.println(" lütfen cümlede aratmak istediğiniz metni yazınız...");
      String metin = scanner.nextLine();

        int metin1 = cumle.indexOf(metin);
        int metin2 = cumle.indexOf(metin,metin1+1);
          if (cumle.indexOf(metin) ==-1){
              System.out.println( " cümle aranan metni içermiyor");
          }
        else if ( cumle.indexOf(metin2) != -1){
                System.out.println( " cümle aranan metni bir adet  içeriyor");}

          else {

              System.out.println("cumle aranan metni 1'den fazla iceriyor");
          }







    }
}
