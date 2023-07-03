package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_set { //crud update işlemi için kullanılır
    public static void main(String[] args) {


        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin]

        System.out.println("city.size() = " + city.size()); // city.size() = 5

        System.out.println("city.set(0,\"samsun\") = " + city.set(0, "samsun")); // city.set(0,"samsun") = Angara



    }
}
