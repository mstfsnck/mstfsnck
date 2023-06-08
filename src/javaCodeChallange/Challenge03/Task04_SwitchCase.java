package javaCodeChallange.Challenge03;

import java.util.Scanner;

public class Task04_SwitchCase {
     /**
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("gün giriniz :");

         String gun=scan.next().toLowerCase();

         switch (gun) {
             case"pazartesi":
             case"salı":
                 System.out.println("java class day");
                 break;

             case "perşembe":
             case"Cuma":
                 System.out.println("selenium day");
                 break;

             case"çarşamba":
             case "cumartesi":
                 System.out.println("SQL calss day");
                 break;

             default:
                 System.out.println("off day ");

         }




     }
}
