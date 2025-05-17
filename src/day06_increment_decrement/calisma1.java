package day06_increment_decrement;

public class calisma1 {
    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        a++;

        System.out.println("12. satırda a :"   + a);  //11

      --b;
        System.out.println("15. satırda b :"   + b);  //19

        a = 10;
        System.out.println(  a++ );//10

        System.out.println("19. satırda a : "   + a);//11

        a= 10;
        int c = a++;

        System.out.println("19. satırda a : "   + a  + "  ve  c"   + c);  //a 11  c 10


        a= 10;
        System.out.println("a nın değeri  :  " + ++a);  //11

       b = a++;
        System.out.println("b ' nin değeri :  "  + b);// 11

                c = b++ + a;

        System.out.println("c nin değeri :  " + c);// 23

        System.out.println("son toplam :  " + (a+b+c)); //47

    }
}
