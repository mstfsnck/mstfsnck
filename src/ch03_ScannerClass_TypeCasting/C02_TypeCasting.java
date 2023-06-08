package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
        /*
         byte < short < int < long < float < double
            Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina Java  otomatik olarak yapar.
         */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

        boolean basariliMi = true;
        //CTE  String basari = basariliMi; dogal uyum olmadigi icin hata verir

        String basari = String.valueOf(basariliMi);//boolean olan bir degeri Stringe cevrildi
        System.out.println("basari = " + basari);//basari = true
        double d = 17 ;//double container ina  int olan 17 degeri atandi Auto Widening yapildi
        System.out.println("d = " + d);// 17.0

        int sayi1 = 33;
        int sayi2 = 4;

        System.out.println("sayi1/sayi2 = " + ( sayi1/sayi2)); // sonuc tamsayı olmadığı için virgül sonrasını vermez int olduğu için

        byte by =127;
        int number =  by; // küçük kutuyu büyük kutuya ekledik

        int num = 123;
        double d1 = 14;
        double d2 = d1 / num ;
        System.out.println("d2 = " + d2); // ondalıklı çıkar sonuç

        double db1 = 14.66;
        int i = (int) db1; // büyük olan kutu küçük olan kutuya eklenmeye çalışıldı
        System.out.println("db1 = " + db1); // 14,66


        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter giriniz :");
        char ch = input.next().charAt(0); // kullanıcın girdiği ifadenin ilk karakterialınıp char variable a atandı
        // tek bir karakter kullanılabilmesi için charAt() methodu kullanıldı
        System.out.println("ch = " + ch);


    }
}