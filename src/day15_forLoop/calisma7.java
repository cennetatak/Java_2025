package day15_forLoop;

import java.util.Scanner;

public class calisma7 {
    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // faktoryel değerini aşağıdaki gibi yazdırın
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17'den kucuk pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        int faktoryel = 1;

        System.out.print(girilenSayi +"! = " );
        for (int i = girilenSayi; i >=1 ; i--) {
            faktoryel *= i;
            System.out.print(i);
            if (i>1)
                System.out.print(" * ");
        }
        System.out.print(" = " + faktoryel );









    }
}
