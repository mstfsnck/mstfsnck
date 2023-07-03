package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        int sayi= 99;
        int[] arr = new int[5];
        int[][] arrMd= new int [5] [6];

        // ArrayList tanımlama ve create etme
        ArrayList<String> names = new ArrayList<>(); // boyut belirtmeye gerek yok
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("names = " + names);
        System.out.println("numbers = " + numbers);

        //arrayliste veri ekleme
        names.add("22");
        names.add("safak");
        names.add("iclal");
        names.add("2261");
        names.add("mustafa");
        names.add("proleterya");

        System.out.println("names = " + names); // names = [22, safak, iclal, 2261, mustafa, proleterya]

        numbers.add(55);
        numbers.add(65);
        numbers.add(34);
        numbers.add(35);
        numbers.add(33);
        numbers.add(9);
        numbers.add(96);
        numbers.add(55);

        System.out.println("numbers = " + numbers); // numbers = [55, 65, 34, 35, 33, 9, 96, 55]

        // 2.yol arrayList e eleman ekleme
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin]


        // 3. yol List.of() methodu ile
        ArrayList<String> country = new ArrayList<>(List.of("madagaskar","almanya","OF","NORVEC"));
        System.out.println("country = " + country); // country = [madagaskar, almanya, OF, NORVEC]

        country.add(1,"turkiye");
        System.out.println("country.size() = " + country); // country = [madagaskar, almanya, OF, NORVEC]
        System.out.println("country.size() = " + country.size()); // country.size() = [madagaskar, turkiye, almanya, OF, NORVEC]



    }
}
