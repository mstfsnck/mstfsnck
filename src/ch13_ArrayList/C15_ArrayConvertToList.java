package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_ArrayConvertToList {
    public static void main(String[] args) {

        String[] names = {"Ali","Zeynep","Fatih","Safak"};
        System.out.println(Arrays.toString(names));

        List<String> nameList=Arrays.asList(names);
        System.out.println(nameList);

        // System.out.println(nameList.add("zafer")); // ekleme ve çıkarma işlemi yapamıyoruz RTE

        ArrayList<String> nameArrayList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameArrayList);// [Ali, Zeynep, Fatih, Safak]

        Collections.sort(nameArrayList);
        System.out.println(nameArrayList); // [Ali, Fatih, Safak, Zeynep]



    }
}
