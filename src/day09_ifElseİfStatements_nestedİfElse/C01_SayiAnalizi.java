package day09_ifElseİfStatements_nestedİfElse;

import java.util.Scanner;

public class C01_SayiAnalizi {
    public static void main(String[] args) {


        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

      Scanner scanner = new Scanner(System.in);
      System.out.println("lütfen pozitif bir tam sayı giriniz");
      int sayi= scanner.nextInt();

      if (sayi<0) System.out.println("Pozitif sayı girmelisiniz ");
      else if (sayi<10) System.out.println("girdiğiiz sayı rakam  ");
      else if (sayi<100) System.out.println("iki basamaklı sayı");
      else if (sayi<1000) System.out.println("üç basamaklı sayı");
      else System.out.println("çok büyük sayı ");
    }
}
