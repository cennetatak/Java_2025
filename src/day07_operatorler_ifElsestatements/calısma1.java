package day07_operatorler_ifElsestatements;

public class calısma1 {
    public static void main(String[] args) {

        //stringlerde karşılaştırma

        String str1 = "ali";
        String str2 ="ali";

        System.out.println(str1 == (str2));

        int a = 10;
        int b = 20;

        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;

        System.out.println("& ile sonuc1:" + sonuc1);//



    }
}
