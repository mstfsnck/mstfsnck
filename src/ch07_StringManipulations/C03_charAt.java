package ch07_StringManipulations;

import java.util.Scanner;

public class C03_charAt {
    public static void main(String[] args) {

        /*
       charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
       index değeri 0'dan başlar
        */

        String city = "Istanbul";
        // city variable in,n birinci karakterini bulun yazdırın

        System.out.println("city.charAt(0) = " + city.charAt(0)); // city.charAt(0) = I

        //city variable inin birinci indexte ki elemanı bulun yazdrın
        System.out.println("city.charAt(1) = " + city.charAt(1)); //city.charAt(1) = s
        char cityBirinciIndexElmanı = city.charAt(1);
        System.out.println("cityBirinciIndexElmanı = " + cityBirinciIndexElmanı); // cityBirinciIndexElamanı = s

        //task son karakteri alın atama ile yazdıran kod yazınız

        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));

        // task son karakteri alin atama ile yazdıran kod yazınız
        int sonHarIndexi = city.length()-1;
        System.out.println("sonHarIndexi = " + sonHarIndexi); // sonHarfIndexi = 7

        System.out.println("city.charAt(sonHarIndexi) = " + city.charAt(sonHarIndexi));

        // alınan son karakteri uygun bir variable a atama yaparak yazdırın
        char ch = city.charAt(city.length()-1);
        System.out.println("ch = " + ch);

        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
// print eden code create ediniz...

        Scanner input =new Scanner(System.in);
        System.out.println("şehir gir");
        String sehir= input.nextLine();

        if (sehir.length()%2!=0){
            System.out.println(sehir.charAt((sehir.length()) / 2));
        }else System.out.println(" orta karakteri yoktur");


    }
}
