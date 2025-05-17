package day08_ifElsestatements;

import java.util.Scanner;

public class C04_İfElse_eşkenarÜcgen {
    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunluklarini alin
        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin değilse eşkenar değil yazdırın
        // NOT : kenar uzunluklari pozitif olmalidir

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını yazınız...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if ( kenar1 == kenar2 && kenar2 ==kenar3 && kenar1>0){
            System.out.println("eşkenar üçgen");}  else {
            System.out.println("eşkenar üçgen değil");
        }










    }
}
