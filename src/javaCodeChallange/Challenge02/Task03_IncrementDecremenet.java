package javaCodeChallange.Challenge02;

public class Task03_IncrementDecremenet {
    public static void main(String[] args) {

        /*
  Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
  Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
 */

        System.out.println("*** artırma ***");
        int a=1;
        System.out.println("++a = " + ++a); //2
        System.out.println("a++ = " + a++); //2
        System.out.println("a = " + a); //3

        int b=5;
        System.out.println("--b = " + --b); //4
        System.out.println("b-- = " + b--); //4
        System.out.println("b = " + b); //3


        int x=20;
        int y=15;

        System.out.println("++x + y-- = " +( ++x + y--)); // 36
        System.out.println("x = " + x);//21
        System.out.println("y = " + y);//14

        System.out.println("++x + y-- = " +( ++x + y--)); //36

        System.out.println("x = " + x); //22
        System.out.println("y = " + y); //13

    }
}
