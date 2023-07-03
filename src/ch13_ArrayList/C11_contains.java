package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("madagaskar","almanya","OF","NORVEC"));
        System.out.println("country = " + country); // country = [madagaskar, almanya, OF, NORVEC]

        System.out.println(country.contains("ALMANYA")); //false
        System.out.println(country.contains("madagaskar"));//true

    }
}
