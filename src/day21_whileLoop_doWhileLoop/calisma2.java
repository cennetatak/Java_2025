package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500'u gecerse veya kullanici 0'a basarsa
        //         kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin


        // kullanicidan alinan pozitif tamsayidan baslayarak
        // 1'e kadar olan sayilari aralarinda 1 bosluk olacak sekilde
        // yan yana yazdirin


        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulun,
        //         tamkare ise true değilse false yazdırın.
        //	Ornek :  input : 16 (4*4) , output: true


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();
        int karekok = 1;

        while(karekok*karekok <= sayi){

            if (karekok*karekok == sayi){
                System.out.println(true);
                break;
            }


            }


            karekok++;

        System.out.println(karekok + " loop bitti");
        // ODEV : false yazmasi icin kod eklenecek


        }




    }

