package day03_kullanicidanBilgiAlma_Scanner;
import  java.util.Scanner;
public class C06_Swap_yerDegistirme {

    public static void main(String[] args) {

    //kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen ilk tam sayıyı giriniz..");
        int sayi1 = scanner.nextInt();


        System.out.println("lütfen ikinci tam sayıyı giriniz");
        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi2 ;
        sayi2 =sayi1;
        sayi1 = temp ;

        System.out.println("sayıların yerini değiştirdim ,\nsayi1:" + sayi1 + "sayi2:" +sayi2);
























    }
}
