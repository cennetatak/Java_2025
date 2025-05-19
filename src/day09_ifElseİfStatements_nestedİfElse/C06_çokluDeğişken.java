package day09_ifElseİfStatements_nestedİfElse;

import java.util.Scanner;

public class C06_çokluDeğişken {
    public static void main(String[] args) {


        // Kullanicidan aldigi urun adedini ve indirimsiz birim fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("aldığınız ürünün adedini yazınız...");
        int adet = scanner.nextInt();
        System.out.println("aldığınız ürünün birim fiystını yazınız...");
        double birimFiyat = scanner.nextDouble();

        System.out.println("müşteri kartınız var mı?..  'E': evet  'H': hayır");
         char kartVarMi = scanner.next().toUpperCase().charAt(0);
        double indirimsizToplamFiyat = adet * birimFiyat;
        if (kartVarMi=='E' && adet>10)
            System.out.println("%20 indirimli fiyat:"+indirimsizToplamFiyat*80/100    );
        else if (kartVarMi=='E') // condition  'adet <=10' is always 'true' when reached
            System.out.println("%15 indirimli fiyat:"  + indirimsizToplamFiyat *85/100);
        else if (kartVarMi=='H' && adet>10)
            System.out.println("%15 indirimli fiyat  " + indirimsizToplamFiyat *85/100);
        else if (kartVarMi=='H') //&& adet<1=10
            System.out.println("%10 indirimli fiyat  " + indirimsizToplamFiyat *90/100);
        else
            System.out.println("girilen değerler için fiyat hesaplanamıyor");





    }
}
