package ch04_JavaOperators.jo01.ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamıTask {
    public static void main(String[] args) {

        // kullanıcıdan alıcan 3 basamaklı sayının rakamları toplamını print eden code create ediniz
        // input 123
        // output 6

        Scanner input = new Scanner(System.in);
        System.out.println("üç basamaklı sayı gir : ");

        int sayi= input.nextInt(); // user ın girdiği değer atandı

        int birlerBasamagi = sayi % 10 ; // sayinin 10 a bölümünden kalan birler basamaği atandı

        sayi /= 10; // sayinin birler basamaği atıldı

        int onlarBasamagi = sayi % 10 ; // sayinin yuzler basamağı alınmış oldu

        int yuzlerBasamagi = sayi / 10; //sayinin yüzler basamaği alinmis oldu

        int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;
        System.out.println("toplam : " + toplam); // toplam = 6















    }
}
