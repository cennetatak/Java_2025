package day04_dataCasting;

import java.util.Scanner;

public class calısma2 {
    public static void main(String[] args) {

      //kullanıcıdan bir harf alın ve alfabede o harften
      // sonraki 3 harfi yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir harf giriniz...");

        char girilenHarf = scanner.nextLine().charAt(0);

        System.out.println("girilen harf :" + girilenHarf);

        char girilenHarf2 = 'K';
        System.out.println("girilen 2. harf:"+ girilenHarf2);
        System.out.println( girilenHarf2 +"   harfinden sonraki üçharf:");
        System.out.println(  (char) (girilenHarf2+1) );
        System.out.println(  (char) (girilenHarf2+2) );
        System.out.println(  (char) (girilenHarf2+3) );
    }
}
