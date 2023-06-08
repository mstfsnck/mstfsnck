package javaCodeChallange.Challenge02;


import java.util.Scanner;

public class Task07_IfStatement {
    /*
​
		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.
​
		 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");

        int yas = input.nextInt();

       //  System.out.println("kilo giriniz :");
       //  int kilo = input.nextInt();

        if (yas>=18){
            System.out.println("kilonu giriniz :");
            int kilo = input.nextInt();
            if (yas>0 || yas <50){
                System.out.println("kan bağışı yapamaz");
            }else System.out.println("kan bağışı yapabilir");


        }else System.out.println("yasınız 18 den küçük kan bağışı yapamaz");





    }


    }

