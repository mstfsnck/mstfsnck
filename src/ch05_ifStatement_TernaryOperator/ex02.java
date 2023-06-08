package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        /*
Kullanicidan 100 uzerinden notunu isteyin.
Not'u harf sistemine cevirip yazdirin.
50’den kucukse "D",->1,2,3..49
=50  <60 arasi "C",->50,51,52,..59
=60  <80 arasi "B",->60,61,62,63..79
=80’nin uzerinde ise "A"->80,81..100
*/

        Scanner scan= new Scanner(System.in);
        System.out.println("0 ile 100 arasında not giriniz ;");
        int not = scan.nextInt();

        if(not<0){
            System.out.println("değer aralığı yanlış");
        }else if(not<50){
            System.out.println("D");
        } else if (not<60) {
            System.out.println("C");
        } else if (not<80) {
            System.out.println("B");
        }else if(not<101){
            System.out.println("A");
        }else
            System.out.println("sınırın dışında değer girdiniz");


    }
}
