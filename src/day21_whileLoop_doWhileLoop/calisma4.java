package day21_whileLoop_doWhileLoop;

public class calisma4 {
    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin rakamlar toplamini
        // while loop ile bulup
        // bize donduren bir method olusturun

        System.out.println(" 1234 sayısının rakamlar toplamı:  "+ getRakamlarToplami(1234));
        System.out.println(getRakamlarToplami(6655));

    }
    public static int getRakamlarToplami(int sayi){

        int rakam =0;
        int rakamlarToplami=0;
        while (sayi>0){
            rakam =sayi%10;
            rakamlarToplami=rakam+rakamlarToplami;
            sayi/=10;
        }
         return rakamlarToplami;


    }

}
