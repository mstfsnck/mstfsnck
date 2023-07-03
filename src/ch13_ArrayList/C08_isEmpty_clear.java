package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_isEmpty_clear {
    public static void main(String[] args) {

        //isEmpty();-> listin boş olmasını kontrol eder true/false return eder.
//clear(); -> listin tum elelmalrını siler

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city);

        System.out.println("city.isEmpty() = " + city.isEmpty());

        city.clear();
        System.out.println("city = " + city);

        System.out.println("city.isEmpty() = " + city.isEmpty());


    }
}
