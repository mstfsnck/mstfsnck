package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {


        /*
 TASK -> girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..

*/

        Scanner scan = new Scanner(System.in);
        System.out.println("bir ifade gir :");

        char ilkKarakter = scan.next().charAt(0); // girilen ifadenin ilk karakteri charAt(0) ile alınıp atandı

        if(ilkKarakter>='A' && ilkKarakter<='Z'  || ilkKarakter >= 'a' && ilkKarakter<='z'){
            System.out.println("girdiğin ifadenin ilk karakteri harftir");
        }else
            System.out.println("girdiğin karakterin ilk karakteri harf değildir");












    }
}
