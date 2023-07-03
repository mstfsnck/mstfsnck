package javaCodeChallange.Challenge08;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        /**
         task->
         verilen bir int dizisi için elemanların karelerini print eden code create ediniz

         */

        int arr [] = {2,6,4,8,9};
        for (int i = 0; i < arr.length ; i++) { // arr elemanlarının tekrara alan lopp tanımlandı
            arr[i] *= arr[i]; // arr[i] = arr [i] * arr [i];
        }
        System.out.println("array elemanları kareleri ;" + Arrays.toString(arr)); // array elemanları kareleri ;[4, 36, 16, 64, 81]


    }
}
