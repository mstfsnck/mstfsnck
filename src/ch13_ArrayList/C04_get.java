package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {
        // get();  -> listte istenen elemanı return eder ( arr[3]  -> arr in 3. index deki elemanı ver

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin]

        System.out.println("city.get(1) = " + city.get(1)); // erzurum

        // System.out.println("city.get(20) = " + city.get(20)); //  Index 20 out of bounds for length 5

    }
}
