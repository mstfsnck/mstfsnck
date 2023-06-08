package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

        // TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
        // 18 den kucuk ise ehliyet alamazsınız oprint ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("yas giriniz :");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("geçerli bir değer giriniz :");
        } else if ((yas <18)) {
            System.out.println("yasınız ehliyet için küçük");
        }else
            System.out.println("ehliyet alabilirsiniz");


    }
}
