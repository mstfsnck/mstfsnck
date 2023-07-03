package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size {
    public static void main(String[] args) {
        // size() method arrayListin uzunluğunu verir yani eleman sayisini

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city);

        System.out.println("city.size() = " + city.size());


    }
}
