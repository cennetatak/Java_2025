package day07_operatorler_ifElsestatements;

import java.util.Scanner;

public class C06_eskenarUcgenKontrolu {
    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunluklarini alin
        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin
        // NOT : kenar uzunluklari pozitif olmalidir

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını yazınız...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if ( kenar1 == kenar2 && kenar1 ==kenar3 && kenar1>0){
            System.out.println("eşkenar üçgen");
        }








    }
}
