package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

// Example 1: bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız

        int  a=3;

        if (a>0){
            System.out.println("sayi pozitif");
        }else {
            System.out.println("sayi negatif");
        }

        // ternary ile
        // CTE atama yapmak lazım a>0? "pozitif" : "negatif" ; Not a statement

        String sonuc = a>0? "pozitif" : "negatif";
        System.out.println(sonuc);


        // atama yapmadan nasıl kullanılır

        System.out.println("atama yqapmadan sonuc");
        System.out.println(a>0? "pozitif" : "negatif");


        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz

        int b=23;
        int c=53;

        int min = b>c ? c : b;
        System.out.println("min= " + min);


        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
//           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
//           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

        int d = -1;
        int abs =d>0 ? d : (-1*d);
        System.out.println("abs :" + abs);


        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
// farkli isaretli ise "Islem yapamam" mesaji veriniz             //return type String

        int e=13;
        int f=23;

        Object obj = (e>0 && f>0) || (e<0 && f<0) ? (e*f) : "islem yapamam" ;
        // eğer şartlae iki farklı değer return edyorsa atamayı parent classdan yapmak gerekir
        System.out.println("obj" + obj);


        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz :" );

        int sayi = scan.nextInt();

        String result = sayi%2 ==0 ? "çift sayıdır" : "tek sayi";
        System.out.println(result);

    }
}
