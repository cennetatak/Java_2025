package day03_kullanicidanBilgiAlma_Scanner;
import  java.util.Scanner;
public class C04_dikdortgeninAlaniniYazdirma {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin kenar ölçülerini giriniz...");
        double uzunkenar = scanner.nextDouble();
        double kisakenar = scanner.nextDouble();

        System.out.println("dikdortgenin alan ölçüsü:" + (uzunkenar*kisakenar));

    }
}
