package ch09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);

        String sifre="12345.abs";

        int girisHakki=3;

        while (true){
            System.out.println("pin kod gir");
            String password = scan.nextLine();

            if(sifre.equals(password)){
                System.out.println("sifre esleşti");
                break;
            }else {
                System.out.println("sifre yanlış tekrar dene");
                girisHakki--;
                System.out.println("kalan deneme hakkı " + girisHakki);

                if (girisHakki == 0){
                    System.out.println("bloke oldun");
                    break;
                }
        }








    }
}}
