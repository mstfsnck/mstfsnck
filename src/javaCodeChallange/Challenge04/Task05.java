package javaCodeChallange.Challenge04;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
         * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("4 kelime giriniz");

        String kelime1= scan.next();
        String kelime2= scan.next();
        String kelime3= scan.next();
        String kelime4= scan.next();

        System.out.println(kelime1.toUpperCase().charAt(0) + kelime1.substring(1)+" "+kelime2+" "+" "+kelime3+" "+kelime4+".");



    }
}
