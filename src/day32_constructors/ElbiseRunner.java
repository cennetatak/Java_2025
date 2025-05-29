package day32_constructors;

public class ElbiseRunner {




public static void main(String[] args) {


    System.out.println();
    Elbise elbise2 = new Elbise();

    elbise2.renk= "kırmızı";
    elbise2.fiyat= 150;
    System.out.println(" elbise2 ==>  " + elbise2);


    Elbise elbise3 = new Elbise();
    System.out.println("elbise3 ==> " + elbise3);

    Elbise elbise4 = new Elbise(500,"kırmızı ","volanlı",130);
    System.out.println("elbise4==>  "+ elbise4);

    Elbise elbise5= new Elbise(1500,"yeşil ","asimetrik kesim",140){};
    System.out.println("elbise5==>  "+ elbise5);
}}
