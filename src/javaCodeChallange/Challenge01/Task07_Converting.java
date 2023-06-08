package javaCodeChallange.Challenge01;

import java.util.Scanner;

public class Task07_Converting {
    public static void main(String[] args) {

        /*  task->
    girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
    formül
    c = (f-32)*5/9
*/

        Scanner input = new Scanner(System.in);
        System.out.println("sıcaklık değeri giriniz :");
        double sıcaklık = input.nextDouble();
        System.out.println("sıcaklık derecesi :" + (sıcaklık-32)*5/9);






    }
}
