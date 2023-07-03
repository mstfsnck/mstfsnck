package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        // indexOf() -> list içinde istenen elemanın index değerini return eder

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin]


        ArrayList<String> country = new ArrayList<>(List.of("madagaskar","almanya","OF","NORVEC"));
        System.out.println("country = " + country); // country = [madagaskar, almanya, OF, NORVEC]

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun")); // city.indexOf("samsun") = -1

        System.out.println("city.indexOf(\"Angara\") = " + city.indexOf("Angara")); // city.indexOf("Angara") = 0

        country.add("Ingiltere");
        System.out.println("country.indexOf(\"Ingiltere\") = " + country.indexOf("Ingiltere"));
        System.out.println("country.lastIndexOf(\"Ingiltere\") = " + country.lastIndexOf("Ingiltere"));


    }
}
