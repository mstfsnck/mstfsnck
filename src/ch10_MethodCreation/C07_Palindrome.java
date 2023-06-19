package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {

        /*
girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
plindrome:her iki yönde okundugunda eşit olan ifadeler
madam , ada ,iki asa, 121
 */

Scanner input=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime=input.nextLine();

        palindrome(kelime);



    }

    private static void palindrome(String k) {
        String ters=""; // bos konteynır olusturuldu

        for (int i = k.length()-1; i >=0 ; i--) { // kelime tersten alındı
            ters += k.charAt(i);            // tersten herbir harf tek tek atandı

        }
        System.out.println("girdiğin kelimenin tersi = " + ters);

        if(ters.equals(k)){
            System.out.println("bu kelime palindrome dur");
        }else System.out.println("bu kelime palindrome değildir");



    }
}
