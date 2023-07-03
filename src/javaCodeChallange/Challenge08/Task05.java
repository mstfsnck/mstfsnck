package javaCodeChallange.Challenge08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
        task->
        kullanıcıdan aldığımız 8 elemanlı arrayin içinde
        kac tane 3 e bolunebilen sayi vardır ?
         */

        int arr[] = new int[8]; // 8 eleman alcak boş bir array tanımlandı
        Scanner input = new Scanner(System.in);
        int count=0; // 3'e tam bolunen arr elaman sayisi

        for (int i = 0; i <8 ; i++) {
            System.out.print(i+ ". index elamanını giriniz : ");
            arr[i] = input.nextInt();
        }


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%3==0) { // döngüdeki herbir array elemanının 3 e bolunme sartı
                count ++;
            }

        }
        System.out.println("girilen arr deki 3'e tam bolunen eleman sayisi : " + count);








    }
}
