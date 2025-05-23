package day25_arrays;

public class calisma1 {
    public static void main(String[] args) {

        // verilen int bir array'in tum elementlerini toplayip
        // toplam degerini yazdirin

        int[] sayilar = {3,5,7,1,2,4};
        int toplam = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
        }

        System.out.println("array'in elementleri toplamı: " + toplam);

    }


      // verilen int bir array'in tum elementlerini toplayip
    // toplam degerini yazdiran bir method olusturun

    public static void elementlerinToplami(int[] arr){
        int[] sayilar = {3,5,7,1,2,4};
        int toplam = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("array'in elementleri toplamı: " + toplam);



        // verilen int bir array'in tum elementlerini toplayip
        // toplam degerini donduren bir method olusturun


    }
    public static int getElementlerinToplami(int [] arr){
        int[] sayilar = {3,5,7,1,2,4};
        int toplam = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        return toplam;
    }
}
