package day18_methodOlusturma;

public class calisma4 {
    public static void main(String[] args) {
  toplam(4,8.2);
  toplam(5.6,9);
  toplam(3,5,7);
  toplam(6);

    }
        public static void toplam (int a ){
            System.out.println(a);
        }

    public static void toplam (int a ,double b){
        System.out.println(a+b);
    }

    public static void toplam (int a ,int b,int c){
        System.out.println(a+b+c);
    }


    public static void toplam (double a ,int b){
        System.out.println(a+b);
    }
}
