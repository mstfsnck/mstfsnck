package ch07_StringManipulations;

public class C01_Concatanation {
    public static void main(String[] args) {

        /*
        concat() methodu içine(parametre) aldığı string variable'ı çalıştığı stringn sonuna ekler
        java da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar
         */

       String name = "Batu" ;
       String title = "SDET QA" ;
       int age = 30 ;

        System.out.println(name + title);
        System.out.println("name.concat(title) = " + name.concat(title));

        System.out.println("age = " + age);

        //String i int e nasıl çeviririz
        String number = "123456";
        System.out.println("number = " + number+1); //number = 123456

        //output 123456 olmalı
        System.out.println("Integer.parseInt(number + 1) = " + Integer.parseInt(number + 1));
        System.out.println("name.concat(true+ \" :) \") = " + name.concat(true + " :) "));
        System.out.println("name.concat(100+\" :) \") = " + name.concat(100 + " :) "));

    }
}
