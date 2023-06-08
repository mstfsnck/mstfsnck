package ch07_StringManipulations;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

        /*
        String içerisnde istenen stringin varlığını kontrol eder boolean return eder..

         */

        String str = "java ile gunler";
        System.out.println("str = " + str);

      // CTE  System.out.println("str.contains('java') = " + str.contains('java'));  parametre String olmalı

        System.out.println("str.contains(\"java\") = " + str.contains("java")); //true

        System.out.println("str.contains(\"Java\") = " + str.contains("Java")); //false , büyük har duyarlılığından dolayı

        System.out.println("str.contains(\" \") = " + str.contains(" ")); // true

        System.out.println("str.contains(\"\") = " + str.contains("")); //true


        // task-> girilen uruunun var olup olmaidginiz kontrol eden bir code create ediniz -> ternary kullanınız

        Scanner input =new Scanner(System.in);
        System.out.println("ürün  gir");
        String urun= input.nextLine();
        System.out.println("aradığın ürünü gir");
        String arananUrun=input.nextLine();

        System.out.println(urun.contains(arananUrun) ? "aranan ürün vardır" : "aranan ürün yoktur");


//TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
// ternary ile switch ile if ile yapiniz
//contains methodu sifre kontrol islemlerinde KULLANILMAMALI

        String password =" 123456789"; // başlangıçtaki şifre

        System.out.println("sifreni gir :");
        String sifre = input.nextLine();

        if(sifre.contains(password)){
            System.out.println("you can login");
        }else System.out.println(" you can't login");


        //burdaki BUG i bulunuz
        // + - karakter girildiğinde de kabul eder
        // 1234567890 olarak girersem de şifreyi kabul eder ama contains old için
        // 1 girsem erişim sağlarım

        String result2 = sifre.contains(password) ? "you can log in with ternary" : "bye bye happeness";
        System.out.println("result2 = " + result2);




    }
}
