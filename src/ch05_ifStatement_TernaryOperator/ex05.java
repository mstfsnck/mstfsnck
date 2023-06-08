package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        /*
  TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

 */

        Scanner input=new Scanner(System.in);
        System.out.println("bırıncı tam sayıyı gırınız");
        int a = input.nextInt();
        System.out.println("ıkıncı tam sayıyı gırınız");
        int b = input.nextInt();
        System.out.println("ıkı sayının toplamı ="+(a+b));
        System.out.println("ıkı sayının farkı ="+(a-b));
        System.out.println("ıkı sayının carpımı ="+(a*b));
        System.out.println("ıkı sayının bolumu ="+(a/b));

    }
}
