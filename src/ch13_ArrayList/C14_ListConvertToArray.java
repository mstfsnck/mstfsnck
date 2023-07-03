package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray {
    public static void main(String[] args) {
        // Listi arrau e cevirmek toArray() methodu kullanılır

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","mogadishu","aydin"));
        System.out.println("city = " + city); // city = [Angara, erzurum, izmir, mogadishu, aydin]

        // 1.yol
        Object [] arrCity = city.toArray();

        System.out.println(Arrays.toString(arrCity)); // [Angara, erzurum, izmir, mogadishu, aydin]

        //2. yol toArray methodu ile
        String[] arrCity2 = city.toArray(new String[0]);
        System.out.println(Arrays.toString(arrCity2));


    }
}
