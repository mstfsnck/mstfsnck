package javaCodeChallange.Challenge01;

import java.util.Scanner;

public class Task08_ScannerClass {
    public static void main(String[] args) {

/*
 girilen iki tam sayının toplam ve farkını print eden code create ediniz.

 */

        Scanner scan =new Scanner(System.in);
        System.out.println("birinci sayı :");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayi :");
        int sayi2 = scan.nextInt();

        System.out.println("sayı toplamları :" +(sayi1+sayi2)+" "+"farkları :"+(sayi1-sayi2));





    }
}
