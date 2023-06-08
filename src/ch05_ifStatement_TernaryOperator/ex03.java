package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        /*
girilen bir yılın artık (LEAP YEAR) subat 29 mu olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece
    400’ün katı olan yıllar artık yıldır.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("yil gir :");
        int yil = scan.nextInt();

        String result = (yil %4 == 0 && yil% 100 !=0) || (yil%400==0) ? "Artik yil":"Artik yil değil";
        System.out.println(result);





    }
}
