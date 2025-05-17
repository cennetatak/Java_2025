package day05_wrapperClass_Matematikselİslemler_Concatenation;

public class calisma1 {
    public static void main(String[] args) {

        // String olarak verilen bir sayiyi, matematiksel islem yapabilecegimiz
        // dataya cevirme

        String fiyat1 = "9.94";
        String fiyat2 = "21.74";
        String fiyat3 = "14.86";

        // String olarak verilen yukardaki 3 fiyatin ortalamasini bulun

        double fyt1Dob = Double.parseDouble(fiyat1);
        double fyt2Dob = Double.parseDouble(fiyat2);
        double fyt3Dob = Double.parseDouble(fiyat3);

        System.out.println("fiyat ortalaması:  " + (fiyat1+fiyat2+fiyat3));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        char chr = 'a';

       // verilen chr değeri büyük harf ise true  değilse folse  yazdırın

        System.out.println(Character.isUpperCase(chr)); //false


        //    ''         ''     sayi ise................

        System.out.println(Character.isDigit(chr));// false


        // ...................harf ise ................
        System.out.println(Character.isAlphabetic(chr)); //true


        String str = "Java Candır";
        // string veriable in değerini büyük harflr yazdırın

        System.out.println(str.toUpperCase());  // JAVA CANDIR

    }
}
