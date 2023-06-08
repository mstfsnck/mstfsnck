package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

          /*
Task01
   girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz ;");
        int sayi = scan.nextInt();

        if (sayi<0){
            System.out.println("sayı negatif");
        }else if(sayi >0)
            System.out.println("sayı pozitif");
        else {
            System.out.println("sayı sıfırdır");
        }







    }
}
