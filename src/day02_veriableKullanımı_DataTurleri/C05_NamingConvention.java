package day02_veriableKullanımı_DataTurleri;

public class C05_NamingConvention {

    public static void main(String[] args) {


    //1-veriable isimeri buyuk kucuk harf duyarlıdı
     // case sensitive

     int not = 70;
     int noT =90;
     int nOT =50;
     int Not =67;
     int NOT =43;

        System.out.println(not); // 70
       // System.out.println(NoT); bu haliyle oluşturulmusbir veriable yok, hata verir


        //2- veriable isimleri kucuk harflr başlar
        //buyuk harflr baslasa bile java hata vermez
       // ancak genel kabullere aykırı olur

        //3- veriable isminde harf, sayı veya $ ,ve _ sembolleri olur
        // ancak bosluk veya özel karakterler olamaz


       // int ogrenci yası = 12; gibi bosluk hata verir
        // int ogrenci%yası =12; gibi özel karakter hata verir

        int ogrenci1yası =12;
        int ogrenci_yası =12;
        int ogrenci$yası =12;  // bunlar olur sorun yok


        //4-veriable isimlerinde $ veya _kullanılabilir ama ismin
        // bunlarla baslaması istenmez

        String _okul ="yıldız koleji";
        String $okul ="yıldızkoleji";


        // veriable isminde rakam kullanılabilir
        // ama ismin rakamla baslaması mümkün değildir

        String okul1ismi ="yıldız";
        //String 1okulismi ="yıldız; bu şekilde olmaz hata verir


        // eger veriable ismi birden fazla kelimeden olusuyrsa camel case kullanılır

        double ogrenciYasOrtalaması = 12.5;
        // bi küçük bir büyük harfle baslayarak yazıyoruz yani

        //7-isim olarak anahtar kelimeler kullanılamaz
        // int int = 8, olmaz kullanılmaz














        










    }
}
