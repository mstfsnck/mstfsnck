package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        // nCopies methodu kopyalamak istediğiniz değer, verdiğiniz sayi kadar copyalar

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin]


        ArrayList<String> country = new ArrayList<>(List.of("madagaskar","almanya","OF","NORVEC"));
        System.out.println("country = " + country); // country = [madagaskar, almanya, OF, NORVEC]

        ArrayList<String> yeniLİst = new ArrayList<>(Collections.nCopies(7,"New Zelland"));
        System.out.println("yeniLİst = " + yeniLİst); // yeniLİst = [New Zelland, New Zelland, New Zelland, New Zelland, New Zelland, New Zelland, New Zelland]

        // addAll methodu iki
        city.addAll(country);
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin, madagaskar, almanya, OF, NORVEC]

        city.addAll(1,country);
        System.out.println("city = " + city); // city = [Angara, madagaskar, almanya, OF, NORVEC, erzurum, izmir, mogadishu, aydin, madagaskar, almanya, OF, NORVEC]
        System.out.println("country = " + country); // country = [madagaskar, almanya, OF, NORVEC]




    }
}
