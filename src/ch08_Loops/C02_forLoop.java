package ch08_Loops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        // task girilen pozitif sayıdan 100 e kadar 4 un katı tamsayıları print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif sayı giriniz :");
        int sayi= scan.nextInt();

        if(sayi <= 0){
            System.out.println("pozitif sayi gir");
        }else {
            for(int i=sayi; i<=100; i++){
                if(i%4==0){
                    System.out.print(i + " ");
                }
            }
        }



    }
}
