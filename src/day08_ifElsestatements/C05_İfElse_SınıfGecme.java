package day08_ifElsestatements;

import java.util.Scanner;

public class C05_İfElse_SınıfGecme {
    public static void main(String[] args) {


        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan not al
        System.out.print("Lütfen notunuzu giriniz: ");
        double not = scanner.nextDouble();

        // Koşula göre sonucu yazdır
        if (not >= 50) {
            System.out.println("Sınıfı Geçtin 🎉");
        } else {
            System.out.println("Maalesef Kaldın ❌");
        }





    }
}
