package javaCodeChallange.Challenge01;

import java.util.Scanner;

public class Task09_ScannerClass {
    public static void main(String[] args) {

        //Girilen yaticap değeri için çemberin çevresini ve dairenin alanını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("yarıçap giriniz :");
                int yarıçap=scan.nextInt();
                double pi=3.14;

        System.out.println("çember çevresi :"+ (yarıçap*2*pi)+"\ndaire alanı :" + (yarıçap*yarıçap*pi));






    }
}
