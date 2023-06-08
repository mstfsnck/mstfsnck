package javaCodeChallange.Challenge02;

import java.util.Scanner;

public class Task02_Modulus {
    public static void main(String[] args) {

        /*
         *  Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.
         *
         *   Ex :
         *   input  : 14531
         *   output : 9
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("5 basamaklı sayı giriniz :");
        int sayi=scan.nextInt();

        int ilk2sayi=sayi/1000; //14
        int son2sayi=sayi%100; // 31

        int sonikiToplam = (son2sayi / 10)+(son2sayi%10);
        System.out.println("sonşkşToplam :" + sonikiToplam);

        int ilkikiToplam = (ilk2sayi/10)+(ilk2sayi%10);
        System.out.println("ilkikiToplam :" + ilkikiToplam);


        System.out.println(ilkikiToplam+sonikiToplam);






    }
}
