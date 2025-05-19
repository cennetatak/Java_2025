package day11_switchStatement_stringmanipulations;

import java.util.Locale;

public class calısma3 {
    public static void main(String[] args) {

        String str = "Java güzeldir";
        System.out.println(str.toUpperCase()); // JAVA GÜZELDİR  yazdırdı

       //  kalıcı olması için atama yapmamız lazım

        str = str.toUpperCase();
        str = "BAĞ BAĞCININDIR";

        // bunu ı harfini küçük olarakta ı yazması için bu şekilde yapıyoru
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

        System.out.println(str.charAt(2));



    }
}
