package javaCodeChallange.Challenge04;

import java.util.Scanner;

public class Task01 {
    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim soy isim giriniz");
        String ad= scan.next();
        String soyad = scan.next();

        System.out.println(ad.toUpperCase()+" "+soyad.toUpperCase());
        System.out.println(ad.toUpperCase().concat(" "+ soyad.toUpperCase()));




    }
}
