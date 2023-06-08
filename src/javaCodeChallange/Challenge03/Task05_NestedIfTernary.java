package javaCodeChallange.Challenge03;

import java.util.Scanner;

public class Task05_NestedIfTernary {
    /* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz :");

        int sayyi= scan.nextInt();


        String sonuç = sayyi==0?"Zero":
                sayyi==1?"one":
                        sayyi==2?"two":
                                sayyi==3?"three":
                                        sayyi==4?"four":
                                                sayyi==5?"five":
                                                        sayyi==6?"six":
                                                                sayyi==7?"seven":
                                                                        sayyi==8?"eight":
                                                                                sayyi==9?"nine":"geçersiz";
        System.out.println("sonuç "+sonuç);










    }
}
