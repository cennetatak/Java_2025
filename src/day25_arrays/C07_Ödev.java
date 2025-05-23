package day25_arrays;

public class C07_Ödev {


    // Kullanicidan deger alarak String bir array olusturun
    // String array'deki en uzun ve en kisa ismi yazdirin

    public static void main(String[] args) {

          String[] kelimeler = C05_kullaniciyaArrayOluşturtma.kullaniciyaArrayOlusturt();

          String enkisakelime = kelimeler[0];
          String enuzunkelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length() < enkisakelime.length()) {
                enuzunkelime =kelimeler[i];
            }
            }

        System.out.println(" Girilen kelimelerden en uzun olan : " + enuzunkelime);
        System.out.println(" Girilen kelimelerden en kısa olan : " + enkisakelime);


    }


    }

