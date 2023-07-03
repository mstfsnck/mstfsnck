package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

// remove-> List den istenen eleman siler

        ArrayList<String> country = new ArrayList<>(List.of("madagaskar","almanya","OF","NORVEC"));
        System.out.println("country = " + country); // country = [madagaskar, almanya, OF, NORVEC]

        Collections.sort(country);

        System.out.println(country.remove("NORWAY")); //false
        System.out.println(country.remove("OF"));

        System.out.println(country);

        country.remove(0);
        System.out.println(country);

        country.add("America");
        country.add("hollanda");
        country.add("ukrayna");
        country.add("America");
        System.out.println(country); // [almanya, madagaskar, America, hollanda, ukrayna, America]

        System.out.println(country.remove("America"));

        System.out.println(country); // [almanya, madagaskar, hollanda, ukrayna, America]




    }
}
