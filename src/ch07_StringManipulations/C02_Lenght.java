package ch07_StringManipulations;

public class C02_Lenght {
    public static void main(String[] args) {

 /*
length() methodu girilrn string'in uzunluğunu:içinde bulunan karakter sayısını return eder
butun karakterleri(boşluk vs) sayıp adedini verir
 */

        String str = "clarusway ile java";
        System.out.println("str.length() = " + str.length());

        //method parantezi boş ise bumethod parametresiz demektir

        int lengthOfStr = str.length();
        System.out.println("lengthOfStr = " + lengthOfStr);

        String str1= "";
        System.out.println("str1.length() = " + str1.length());

        String str2= " ";
        System.out.println("str2.length() = " + str2.length());

        String str3 = null;
       //  System.out.println("str3.length() = " + str3.length()); // nullPointerException

        String str4 = "null";
        System.out.println("str4.length() = " + str4.length());
        System.out.println(str4);

        String str5; // atama yapılmamış bir variable kullanılamaz
       // CTE     System.out.println(str4.concat(str5));

    }
}
