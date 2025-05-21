package day19_MethodOlusturma;

public class C08_JavaKullanacagiMethoduNasilBelirler {


    public static void main(String[] args) {

        topla(3,4); // topla int int
        // Iki int'in toplami : 7

        topla(2.1,3.2); // topla double double
        // Iki double'in toplami : 5.300000000000001

        topla(2, 3.4); // topla int double
        // Iki double'in toplami : 5.4


        topla(5.3, 4); // topla double int
        // Iki double'in toplami : 9.3


        topla( 'a','b'); // topla char char
        // Iki int'in toplami : 195

        //topla(5,true);
        // eger verilen argument'ler hic bir method icin uygun degilse
        // java CTE verir
       // string( 13,"java","güzeldir",'a',2.4);
    }

    public static void topla(int a, int b){ // topla int int

        System.out.println("Iki int'in toplami : " + (a+b));
    }

    public static void topla(double a, double b){ // topla double double

        System.out.println("Iki double'in toplami : " + (a+b));
    }

   //  public static void string (int c,String a  ,String b ,char i,double k ){
    //     System.out.println(" string toplamı   "+c+ a+b+i+k);
     }





