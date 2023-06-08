package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

 /*
Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
 Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
       ödemesi gereken toplam miktarı print eden code create ediniz.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("urun miktaını giriniz");
        int urunMiktar = scan.nextInt();

        System.out.println("urun birim fiyatı girin");
        int urunFiyat = scan.nextInt();

        double fatura = urunMiktar>100 ? (urunFiyat*urunMiktar*0.67) : (urunFiyat*urunMiktar);
        System.out.println("fatura = " + fatura);


    }
}
