package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_subList {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city);

        System.out.println("city.subList(3,5) = " + city.subList(3, 5)); // city.subList(3,5) = [mogadishu, aydin]

        // yeni list oluşturup eski listten eleman cekme
        ArrayList<String> yeniList = new ArrayList<>(city.subList(2,5));

        System.out.println("yeniList = " + yeniList); // yeniList = [izmir, mogadishu, aydin]




    }
}
