package javaCodeChallange.Challenge02;

import java.util.Scanner;

public class Task04_IfStatement {
    /* Task ->
     * Girilen Y/N  degerlerini
     * print eden code create ediniz..
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Y yada N giriniz");
        char aslanKarakter = input.next().charAt(0);
        if (aslanKarakter == 'Y' || aslanKarakter == 'y') {
            System.out.println("YES");
        } else if (aslanKarakter == 'N' || aslanKarakter == 'n') {
            System.out.println("NO");
        } else System.out.println("hatalı giriş");

    }
    }
