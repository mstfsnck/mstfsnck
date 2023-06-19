package ch09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayı gir");

        int sayi= scan.nextInt();
        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i == 0){
                System.out.println(sayi+ " asal değil");
                asalMi=false;
                break;
            }

        }
        if (asalMi && sayi!=1){
            System.out.println(sayi + " sayisi ASAL sayidir");
        }else System.out.println("asal sayi değil");










    }
}
