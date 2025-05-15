package day03_kullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class calısma4 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin iki kenar uzunluğunu yzınız...");
        double uzunKenar = scanner.nextDouble();
        double kısaKenar = scanner.nextDouble();

        System.out.println("dikdörtgenin alan ölçüsü:" + (uzunKenar *kısaKenar));



    }
}
