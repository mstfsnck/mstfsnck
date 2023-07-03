package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replacaAll_fill {
    public static void main(String[] args) {

        // replaceAll() -> listte belirtilen bir elemanı blirli bir değer ile update eder
        // fill() ->

        ArrayList<Integer> ListNumber = new ArrayList<>(Arrays.asList(1,2,4,4,3,66,44,22,546,34));
        System.out.println(ListNumber);

        System.out.println(Collections.replaceAll(ListNumber, 1, 111));

        System.out.println(ListNumber);

        Collections.fill(ListNumber,33);
        System.out.println(ListNumber); // [33, 33, 33, 33, 33, 33, 33, 33, 33, 33]



    }
}
