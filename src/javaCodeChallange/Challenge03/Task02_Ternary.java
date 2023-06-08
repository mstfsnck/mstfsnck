package javaCodeChallange.Challenge03;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat içinb
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("fiyat giriniz :");

        double fiyat = input.nextDouble();

        // şart ise true değilse false

        System.out.println(fiyat < 10 ? "ucuz" : (fiyat >= 10 && fiyat < 20 ? "normal" : "pahali"));


    }

}
