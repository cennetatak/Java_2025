package day38_localDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
public class C04_Localdate {

    public static void main(String[] args) {

        LocalDate tarihAmsterdam = LocalDate.now();
        System.out.println("Tarih Amsterdam : " + tarihAmsterdam);


        LocalDate tarihTokyo = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Tarih Tokyo : " + tarihTokyo);


        LocalDate tarihNewyork = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("Tarih Newyork : " + tarihNewyork);

        // verilen iki dogum tarihinin hangisinin once oldugu bulalim

        LocalDate dogumTarihi1 = LocalDate.of(1990,3,23);
        LocalDate dogumTarihi2 = LocalDate.of(1990, Month.MARCH,15);

        System.out.println(dogumTarihi2.isBefore(dogumTarihi1)); // true
                                       //önce mi?

        // 1980 artik yil mi ?
        LocalDate tarih3 = LocalDate.of(1980,1,23);
        System.out.println(tarih3.isLeapYear()); // true



        // dogum tarihi verilen kisinin yasini bulun
        System.out.println(tarih3.until(tarihAmsterdam)); // P 45Y 2M 12D tarih3 ün yaşını bulduk

        System.out.println(tarihAmsterdam.getMonth()); // APRIL içinde bulunduğumuz ayı isim olarak verir
        System.out.println(tarihAmsterdam.getMonthValue()); // 4  içinde bulunduğumuz ayı değer yani sayı olarak verir
        System.out.println(tarihAmsterdam.getDayOfYear()); // 94 yılın kaçıncı gününde olduğumuzu veriyor

        System.out.println(tarihAmsterdam.lengthOfMonth()); // 30 içinde bulunduğumuz ayın uzunluğunu verir

        System.out.println(tarihAmsterdam.lengthOfYear()); // 365 içinde bulunduğumuz yılın uzunluğunu verir
        System.out.println(tarih3.lengthOfYear()); // 366 sorduğumuz yılın uzunluğunu da verir


         LocalDate tarih5 = LocalDate.of(1992,4,10);
        System.out.println(tarih5.until(tarihAmsterdam));//P 32Y 11M 27D  tarih5 in yaşını yazdırdı




    }
}
